package io.eduonline.devrush.devrushlmsmultiplatform.libs.signalr

import io.ktor.utils.io.core.String
import io.ktor.utils.io.core.toByteArray
import io.ktor.utils.io.errors.IOException
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class JsonHubProtocol(private val logger: Logger) : HubProtocol {

    override val name: String = PROTOCOL_NAME
    override val version: Int = PROTOCOL_VERSION

    private val json by lazy { Json { ignoreUnknownKeys = true } }

    override fun parseMessages(payload: ByteArray): List<HubMessage> {
        val payloadString = String(payload)
        if (payloadString.isEmpty()) return emptyList()
        if (payloadString.substring(payloadString.length - 1)[0] != io.eduonline.devrush.devrushlmsmultiplatform.libs.signalr.RECORD_SEPARATOR) throw RuntimeException(
            "HubMessage is incomplete."
        )

        return payloadString
            .split(io.eduonline.devrush.devrushlmsmultiplatform.libs.signalr.RECORD_SEPARATOR)
            .filter { it.isNotEmpty() }
            .map { str ->
                try {
                    logger.log(Logger.Severity.INFO, "Decoding message: $str", null)
                    json.decodeFromString(str)
                } catch (ex: IOException) {
                    throw RuntimeException("Error reading JSON.", ex)
                }
            }
    }

    override fun writeMessage(message: HubMessage): ByteArray =
        (json.encodeToString(message)
            .also {
                logger.log(
                    Logger.Severity.INFO,
                    "Encoded message: $it",
                    null
                )
            } + io.eduonline.devrush.devrushlmsmultiplatform.libs.signalr.RECORD_SEPARATOR).toByteArray()

    companion object {
        private const val PROTOCOL_NAME = "json"
        private const val PROTOCOL_VERSION = 1
    }
}