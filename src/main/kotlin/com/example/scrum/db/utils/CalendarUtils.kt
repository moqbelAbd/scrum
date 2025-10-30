package dev.mzn.seed.utils

import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.ZonedDateTime

object CalendarUtils {
    private val localZoneId = ZoneId.of("Asia/Riyadh")

    fun now():ZonedDateTime {
        return ZonedDateTime.now(localZoneId)
    }

    fun nowUTC():ZonedDateTime {
        return ZonedDateTime.now(ZoneOffset.UTC)
    }
}
