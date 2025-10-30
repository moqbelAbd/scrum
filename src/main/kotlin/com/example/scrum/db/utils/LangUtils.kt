package utils

//import db.base.LangAttribute
//
//object LangUtils {
//
//    private const val DEFAULT_LANG = "ar"
//    private val languages = setOf("ar", "en")
//    fun getLang(): String {
//        val lang = CommonUtils.getCurrentRequest()?.getHeader("Accept-Language")?.lowercase() ?: DEFAULT_LANG
//        return if (languages.contains(lang)) lang else DEFAULT_LANG
//    }

//    fun fillLangAttribute(value: String?, langAttribute: LangAttribute = LangAttribute()): LangAttribute {
//        langAttribute.ar = value?.trim()
//        langAttribute.en = value?.trim()
//        return langAttribute
//    }
//
//    fun updateLangAttribute(value: String?, langAttribute: LangAttribute?): LangAttribute? {
//        val lang = getLang()
//        when (lang) {
//            "ar" -> langAttribute?.ar = value?.trim()
//            "en" -> langAttribute?.en = value?.trim()
//        }
//        return langAttribute
//    }
//
//    fun getLang(langAttribute: LangAttribute?):String?{
//        return when (getLang()) {
//            "ar" -> langAttribute?.ar?.trim()
//            "en" -> langAttribute?.en?.trim()
//            else -> null
//        }
//    }
//}
