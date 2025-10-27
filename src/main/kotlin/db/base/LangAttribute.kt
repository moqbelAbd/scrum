//package db.base
//
//import db.utils.JsonUtils
//import db.utils.LangUtils
//import db.utils.interpolate
//import jakarta.persistence.AttributeConverter
//import jakarta.persistence.Converter
//import kotlinx.serialization.Serializable
//
//@Serializable
//data class LangAttribute(var ar: String? = null, var en: String? = null) {
//    fun toLangAttribute(): LangAttribute {
//        return LangAttribute(ar = ar, en = en)
//    }
//
//    fun interpolate(map: Map<String, Any?>): LangAttribute {
//        return LangAttribute(ar = ar?.interpolate(map), en = en?.interpolate(map))
//    }
//
//    fun current(): String? {
//        return LangUtils.getLang(this)
//    }
//}
//
//
//@Converter(autoApply = true)
//class LangAttributeConverter : AttributeConverter<LangAttribute, String> {
//
//    override fun convertToDatabaseColumn(attribute: LangAttribute?): String {
//        return JsonUtils.writeValueAsString(attribute ?: LangAttribute())
//    }
//
//    override fun convertToEntityAttribute(dbData: String?): LangAttribute {
//        return JsonUtils.readValue(dbData ?: "{}")
//    }
//}
