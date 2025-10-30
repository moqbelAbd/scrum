package dev.mzn.seed.utils

import org.springframework.core.io.ClassPathResource

object FileUtils {
    lateinit var baseFolder:String

    fun readResourceFile(path: String): String {
        val resource = ClassPathResource(path)
        val inputStream = resource.inputStream
        return inputStream.bufferedReader().use { it.readText() }
    }
}
