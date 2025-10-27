package dev.mzn.seed.utils

import jakarta.servlet.http.HttpServletRequest
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes
import java.lang.Exception

object CommonUtils {

    fun getCurrentRequest(): HttpServletRequest? {
        return try {
            (RequestContextHolder.getRequestAttributes() as ServletRequestAttributes).request
        } catch (e: Exception) {
            null
        }
    }
}
