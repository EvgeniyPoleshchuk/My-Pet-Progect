package io.eduonline.devrush.devrushlmsmultiplatform.libs.signalr

import io.eduonline.devrush.devrushlmsmultiplatform.libs.signalr.AutomaticReconnect.Custom
import kotlin.math.pow
import kotlin.time.Duration

sealed interface AutomaticReconnect {
    data object Inactive : AutomaticReconnect
    fun interface Custom : AutomaticReconnect {
        suspend fun invoke(previousRetryCount: Int, elapsedTime: Duration): Long?
    }

    companion object {
        private val defaultRetryDelays = listOf(0L, 2_000L, 10_000L, 30_000L)

        val Active: AutomaticReconnect = Custom { previousRetryCount, _ ->
            defaultRetryDelays.getOrNull(previousRetryCount)
        }

        fun exponentialBackoff(
            times: Int = 15,
            initialDelay: Long = 1000,
            factor: Double = 1.5,
            maxDelay: Long = 1000 * 60,
        ): AutomaticReconnect = Custom { previousRetryCount, _ ->
            when (previousRetryCount) {
                0 -> initialDelay
                in 1..times -> (initialDelay.coerceAtLeast(1) * factor.pow(previousRetryCount)).toLong()
                    .coerceAtMost(maxDelay)

                else -> null
            }
        }
    }
}