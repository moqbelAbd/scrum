package dev.mzn.seed.utils

import tools.jackson.databind.DeserializationFeature
import tools.jackson.module.kotlin.jacksonMapperBuilder
import tools.jackson.module.kotlin.readValue

object JsonUtils {
    val objectMapper = jacksonMapperBuilder()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false)
        .build()

    fun writeValueAsString(obj: Any): String {
        return objectMapper.writeValueAsString(obj)
    }

    inline fun <reified T> fromObject(obj: Any): T {
        return readValue(writeValueAsString(obj))
    }

    inline fun <reified T> readValue(str: String): T {
        return objectMapper.readValue<T>(str)
    }
}
