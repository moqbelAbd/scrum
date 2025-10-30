package dev.mzn.seed.utils

import java.math.BigDecimal
import java.time.Instant
import java.time.OffsetDateTime
import java.time.ZoneOffset
import kotlin.random.Random

object RandomUtils {
    fun int(min: Int, max: Int): Int {
        return (min..max).random()
    }

    fun doubleList(length:Int,min: Number, max: Number): List<Double> {
        return (1..length).map { double(min, max) }
    }

    fun double(min: Number, max: Number): Double {
        return String.format("%.2f",Random.nextDouble(min.toDouble(), max.toDouble())).toDouble()
    }

    fun long(min: Long, max: Long): Long {
        return (min..max).random()
    }

    fun bigDecimal(min: Long, max: Long): BigDecimal {
        return BigDecimal.valueOf(long(min, max))
    }

    fun boolean(): Boolean {
        return listOf(true, false).random()
    }

    fun string(length: Int): String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }


    fun dateBetween(start: OffsetDateTime, end: OffsetDateTime): OffsetDateTime {
        val startSeconds = start.toEpochSecond()
        val endSeconds = end.toEpochSecond()
        val random = Random.nextLong(startSeconds, endSeconds)
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(random), ZoneOffset.UTC)
    }
}
