package dev.mzn.seed.utils

object StringUtils {
}
fun String.interpolate(map: Map<String, Any?>): String {
    var s = this
    map.forEach { (key, value) -> s = s.replace("{$key}", value.toString()) }
    return s
}
