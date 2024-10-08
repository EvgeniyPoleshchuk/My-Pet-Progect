package io.eduonline.devrush.devrushlmsmultiplatform.domain.network.devrushApi.modules.student.models.getSchoolSettings


import io.eduonline.devrush.devrushlmsmultiplatform.domain.network.devrushApi.modules.auth.models.common.Gamification
import io.eduonline.devrush.devrushlmsmultiplatform.domain.network.devrushApi.modules.auth.models.common.Partnership
import io.eduonline.devrush.devrushlmsmultiplatform.domain.network.devrushApi.modules.auth.models.common.School
import kotlinx.serialization.Serializable

@Serializable
data class GetSchoolSettingsResponse(
    val id: String,
    val number: Int,
    val name: String,
    val description: String,
    val timezoneOffset: String?, // TODO: fix this
    val jsHeadCode: String,
    val jsBodyCode: String,
    val supportChatEnabled: Boolean,
    val disableOpenRegistration: Boolean,
    val showUnavailableStartedCourses: Boolean,
    val isForumAvailable: Boolean,
    val isLocked: Boolean,
    val lang: String,
    val currency: String,
    val logo: Logo? = null,
    val favicon: Favicon,
    val partnership: Partnership,
    val settings: SchoolSettings,
    val profileSettings: ProfileSettings,
    val gamification: Gamification,
)

@Serializable
data class Logo(
    val cloudKey: String,
    val name: String,
    val description: String?,
    val originalName: String,
    val mimeType: String,
    val thumbnailUrl: String?,
    val type: String,
//    val additionalData: null,
    val extension: String,
    val size: Int,
    val completed: Boolean,
    val isPublic: Boolean,
    val isVoice: Boolean,
    val state: String,
    val source: String,
    val createdDate: String,
    val updatedDate: String?,
//    val emailMessageId: null,
//    val externalUrl: String?,
//    val parentId: String?,
//    val parent: null,
    val createdByAdminId: String,
//    val createdByAdmin: null,
//    val createdByStudentId: String?,
//    val createdByStudent: null,
//    val updatedByStudentId: String?,
//    val updatedByStudent: null,
//    val courseId: String?,
//    val course: null,
//    val courseItemId: String?,
//    val courseItem: null,
//    val schoolContentItemCommentId: String?,
//    val schoolContentItemComment: null,
//    val schoolContentItemProgressRatingId: String?,
//    val schoolContentItemProgressRating: null,
//    val courseItemTaskId: String?,
//    val courseItemTask: null,
//    val courseItemTestId: String?,
//    val courseItemTest: null,
//    val courseItemTestQuestionId: String?,
//    val courseItemTestQuestion: null,
//    val courseItemTestAnswerId: String?,
//    val courseItemTestAnswer: null,
//    val courseItemTaskAnswerId: String?,
//    val courseItemTaskAnswer: null,
//    val courseItemTaskAnswerCommentId: String?,
//    val courseItemTaskAnswerComment: null,
//    val forumThreadId: String?,
//    val forumThread: null,
//    val forumTopicId: String?,
//    val forumTopic: null,
//    val forumTopicCommentId: String?,
//    val forumTopicComment: null,
//    val softDeletedByStudentId: String?,
//    val softDeletedByStudent: null,
//    val softDeletedByAdminId: String?,
//    val softDeletedByAdmin: null,
    val updatedByAdminId: String?,
//    val updatedByAdmin: null,
//    val videoId: String?,
//    val video: null,
//    val videoStreamId: String?,
//    val videoStream: null,
//    val chatUserId: String?,
//    val chatUser: null,
//    val chatConversationId: String?,
//    val chatConversation: null,
//    val videoStreamStoryboardId: String?,
//    val videoStreamStoryboard: null,
//    val siteId: String?,
//    val site: null,
//    val sitePageId: String?,
//    val sitePage: null,
//    val quizId: String?,
//    val quiz: null,
//    val children: List<Any>,
//    val admins: List<Any>,
//    val avatarStudents: List<Any>,
//    val schoolFavicons: List<Any>,
    val schoolLogos: List<SchoolLogo>,
//    val sitesFavicons: List<Any>,
//    val siteLogos: List<Any>,
//    val adminTaskFiles: List<Any>,
//    val schoolCallRecords: List<Any>,
//    val conversions: List<Any>,
//    val videoStreams: List<Any>,
    val hasName: Boolean,
    val schoolId: String,
    val school: School? = null,
    val id: String,
    val softDeleted: Boolean,
    val softDeletedDate: String?,
)

@Serializable
data class SchoolLogo(
    val name: String,
    val description: String?,
    val number: Int,
    val domain: String,
    val maxEmailsPerHour: Int,
    val emailReputation: Float,
    val emailThrottlingEnabled: Boolean,
    val customDomain: String?,
    val timezoneId: String?,
    val timezoneOffset: String?, // TODO: fix
    val countryId: String,
    val disableOpenRegistration: Boolean,
    val showUnavailableStartedCourses: Boolean,
    val isForumAvailable: Boolean,
    val createdDate: String,
    val updatedDate: String?,
    val statisticsUpdatedDate: String?,
    val jsHeadCode: String,
    val jsBodyCode: String,
    val supportChatEnabled: Boolean,
    val supportConversationTitle: String,
    val recordInternalCalls: Boolean,
    val recordCRMCalls: Boolean,
    val kinescopeProjectId: String,
    val lang: String,
    val billing: String?, // TODO: мб fix
    //    val metadata: Any?,
    val settings: SchoolLogoSettings,
    val partnership: SchoolSettingsPartnership,
    val gamification: Gamification,
    val currency: String,
    val logoId: String?, // TODO: мб fix
    val faviconId: String?, // TODO: мб fix
    val favicon: Favicon,
    val ownerId: String,
    //    val owner: Any?,
    val studentProfileSettingsId: String,
    val studentProfileSettings: StudentProfileSettings,
    val mainSiteDomainId: String?, // TODO: мб fix
    val mainSiteDomain: String?, // TODO: мб fix
    val schoolStatisticsId: String?, // TODO: мб fix

    //    val schoolStatistics: Any,
//    val emailProfiles: List<Any>,
//    val courses: List<Any>,
//    val users: List<Any>,
//    val userInvites: List<Any>,
//    val paymentGateways: List<Any>,
//    val sites: List<Any>,
//    val siteDomains: List<Any>,
//    val billingTransactions:List<Any>,
//    val sipRegistrations: List<Any>,
//    val applicationSchoolLinks: List<Any>,
//    val chatChannels: List<Any>,
    val currentDomain: String,
    val id: String,
    val softDeleted: Boolean,
    val softDeletedDate: String?,

    )

@Serializable
data class SchoolSettings(
    val registrationAgreementText: String?,
    val isRegistrationAgreementEnabled: Boolean,
    val footerText: String?,
    val isPageFooterEnabled: Boolean,
    val isLearnPageFooterEnabled: Boolean,
)

@Serializable
data class ProfileSettings(
    val email: Boolean,
    val emailNeedConfirm: Boolean,
    val blockAccessIfEmailUnconfirmed: Boolean,
    val blockEmailChange: Boolean,
    val phone: Boolean,
    val phoneRequired: Boolean,
    val phoneNeedConfirm: Boolean,
    val blockAccessIfPhoneUnconfirmed: Boolean,
    val firstName: Boolean,
    val firstNameRequired: Boolean,
    val lastName: Boolean,
    val lastNameRequired: Boolean,
    val middleName: Boolean,
    val middleNameRequired: Boolean,
    val birthday: Boolean,
    val birthdayRequired: Boolean,
    val gender: Boolean,
    val genderRequired: Boolean,
    val schoolId: String,
    val school: ProfileSettingsSchool? = null,
    val id: String,
    val softDeleted: Boolean,
    val softDeletedDate: String?,
)

@Serializable
data class ProfileSettingsSchoolSettings(
    val registrationAgreementText: String?,
    val isRegistrationAgreementEnabled: Boolean,
    val footerText: String,
    val isPageFooterEnabled: Boolean,
    val isLearnPageFooterEnabled: Boolean,
    val hasRegistrationAgreementText: Boolean,
    val hasFooterText: Boolean,
    val schoolId: String,
    val id: String,
    val softDeleted: Boolean,
    val softDeletedDate: String?,
)

@Serializable
data class ProfileSettingsSchool(
    val name: String,
    val description: String,
    val number: Int,
    val domain: String,
    val maxEmailsPerHour: Int,
    val emailReputation: Float,
    val emailThrottlingEnabled: Boolean,
    val customDomain: String?,
    val timezoneId: String,
    val timezoneOffset: String?, // TODO: мб fix
    val countryId: String,
    val disableOpenRegistration: Boolean,
    val showUnavailableStartedCourses: Boolean,
    val isForumAvailable: Boolean,
    val createdDate: String,
    val updatedDate: String?,
    val statisticsUpdatedDate: String?,
    val jsHeadCode: String,
    val jsBodyCode: String,
    val supportChatEnabled: Boolean,
    val supportConversationTitle: String,
    val recordInternalCalls: Boolean,
    val recordCRMCalls: Boolean,
    val kinescopeProjectId: String,
    val lang: String,
    val billing: String?,
//    val metadata: Any?,
    val settings: ProfileSettingsSchoolSettings,
    val partnership: SchoolSettingsPartnership,
    val gamification: Gamification,
    val currency: String,
    val logoId: String,
    val logo: Logo? = null,
    val faviconId: String,
    val favicon: Favicon,
    val ownerId: String,
//    val owner: Any?,

    val studentProfileSettingsId: String,
    val mainSiteDomainId: String,
    val mainSiteDomain: String?,
    val schoolStatisticsId: String?,
//    val schoolStatistics: Any?,
//    val emailProfiles: List<Any>,
//    val courses: List<Any>,
//    val users: List<Any>,
//    val userInvites: List<Any>,
//    val paymentGateways: List<Any>,
//    val sites: List<Any>,
//    val siteDomains: List<Any>,
//    val billingTransactions: List<Any>,
//    val sipRegistrations: List<Any>,
//    val applicationSchoolLinks: List<Any>,
//    val chatChannels: List<Any>,
    val currentDomain: String,
    val id: String,
    val softDeleted: Boolean,
    val softDeletedDate: String?,
)

@Serializable
data class SchoolLogoSettings(
    val registrationAgreementText: String?,
    val isRegistrationAgreementEnabled: Boolean,
    val footerText: String,
    val isPageFooterEnabled: Boolean,
    val isLearnPageFooterEnabled: Boolean,
    val hasRegistrationAgreementText: Boolean,
    val hasFooterText: Boolean,
    val schoolId: String,
    val id: String,
    val softDeleted: Boolean,
    val softDeletedDate: String?,
)

@Serializable
data class SchoolSettingsPartnership(
    val isActive: Boolean,
    val agreementRequired: Boolean,
    val agreementText: String?,
    val agreementUrl: String?,
    val partnerAssigningCookieDurationDays: Int,
    val partnerAssigningDurationType: String,
    val partnerAssigningDurationDays: Int,
    val transferBonusPartner: Boolean,
    val transferBonusPartnerAmount: Float,
    val transferBonusReferral: Boolean,
    val transferBonusReferralAmount: Float,
    val transferFeeMethod: String,
    val transferFeeAllowed: Boolean,
    val transferFeeMinAmount: Float,
    val transferFeeAllowedToBonus: Boolean,
    val transferFeeHoldingPeriodDays: Float,
    val partnershipVisible: Boolean,
    val partnershipPaidOrdersVisible: Boolean,
    val partnershipAllOrdersVisible: Boolean,
    val partnershipOrdersContactVisible: Boolean,
    val createdDate: String,
    val updatedDate: String,
    val activatedDate: String,
    val paymentGatewayFeeEnabled: Boolean,
    val levelCount: Int,
    val partnershipVisibleToGroupId: String?,
    //    val partnershipVisibleToGroup: Any,
    //    val scenario: Any,
    val schoolId: String,
    val id: String,
    val softDeleted: Boolean,
    val softDeletedDate: String?,

    )

@Serializable
data class Favicon(
    val cloudKey: String,
    val name: String,
    val description: String?,
    val originalName: String,
    val mimeType: String,
    val thumbnailUrl: String?,
    val type: String,
//    val additionalData: Any?,
    val extension: String,
    val size: String,
    val completed: Boolean,
    val isPublic: Boolean,
    val isVoice: Boolean,
    val state: String,
    val source: String,
    val createdDate: String,
    val updatedDate: String?,
    val emailMessageId: String?,
    val externalUrl: String?,
    val parentId: String?,
//    val parent: Any?,
    val createdByAdminId: String,
//    val createdByAdmin: Any?,
    val createdByStudentId: String?,
//    val createdByStudent: Any?,
    val updatedByStudentId: String?,
//    val updatedByStudent: Any?,
    val courseId: String?,
//    val course: Any?,
    val courseItemId: String?,
//    val courseItem: Any?,
    val schoolContentItemCommentId: String?,
//    val schoolContentItemComment: Any?,
    val schoolContentItemProgressRatingId: String?,
//    val schoolContentItemProgressRating: Any?,
    val courseItemTaskId: String?,
//    val courseItemTask: Any?,
    val courseItemTestId: String?,
//    val courseItemTest: Any?,
    val courseItemTestQuestionId: String?,
//    val courseItemTestQuestion: Any?,
    val courseItemTestAnswerId: String?,
//    val courseItemTestAnswer: Any?,
    val courseItemTaskAnswerId: String?,
//    val courseItemTaskAnswer: Any?,
    val courseItemTaskAnswerCommentId: String?,
//    val courseItemTaskAnswerComment: Any?,
    val forumThreadId: String?,
//    val forumThread: Any?,
    val forumTopicId: String?,
//    val forumTopic: Any?,
    val forumTopicCommentId: String?,
//    val forumTopicComment: Any?,
    val softDeletedByStudentId: String?,
//    val softDeletedByStudent: Any?,
    val softDeletedByAdminId: String?,
//    val softDeletedByAdmin: Any?,
    val updatedByAdminId: String?,
//    val updatedByAdmin: Any?,
    val videoId: String?,
//    val video: Any?,
    val videoStreamId: String?,
//    val videoStream: Any?,
    val chatUserId: String?,
//    val chatUser: Any?,
    val chatConversationId: String?,
//    val chatConversation: Any?,
//    val videoStreamStoryboardId: Any?,
//    val videoStreamStoryboard: Any?,
//    val siteId: Any?,
//    val site: Any?,
    val sitePageId: String?,
//    val sitePage: Any?,
    val quizId: String?,
//    val quiz: Any?,
//    val children: List<Any>,
//    val admins: List<Any>,
//    val avatarStudents: List<Any>,
//    val schoolFavicons: List<Any>,
//    val schoolLogos: List<Any>,
//    val sitesFavicons: List<Any>,
//    val siteLogos: List<Any>,
//    val adminTaskFiles: List<Any>,
//    val schoolCallRecords: List<Any>,
//    val conversions: List<Any>,
//    val videoStreams: List<Any>,
    val hasName: Boolean,
    val schoolId: String,
    val id: String,
    val softDeleted: Boolean,
    val softDeletedDate: String?,
)

@Serializable
data class StudentProfileSettings(
    val email: Boolean,
    val emailNeedConfirm: Boolean,
    val blockAccessIfEmailUnconfirmed: Boolean,
    val blockEmailChange: Boolean,
    val phone: Boolean,
    val phoneRequired: Boolean,
    val phoneNeedConfirm: Boolean,
    val blockAccessIfPhoneUnconfirmed: Boolean,
    val firstName: Boolean,
    val firstNameRequired: Boolean,
    val lastName: Boolean,
    val lastNameRequired: Boolean,
    val middleName: Boolean,
    val middleNameRequired: Boolean,
    val birthday: Boolean,
    val birthdayRequired: Boolean,
    val gender: Boolean,
    val genderRequired: Boolean,
    val schoolId: String,
    val id: String,
    val softDeleted: Boolean,
    val softDeletedDate: String?,
)