/*
 *  Copyright (c) 2024. MZN
 * https://mzn.dev/
 * This class created by Mahmoud Safi for Yarax Framework
 * This class may not be used for purposes other than MZN projects or without the written permission of MZN Company.
 * Any unauthorized use of this class may result in legal action. Please contact MZN Company for further information on how to obtain permission for alternative uses.
 */

package config

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class SystemProperty {

    @Value("\${backend-domain}")
    val backendDomain: String? = null

    @Value("\${frontend-domain}")
    val frontendDomain: String? = null

    @Value("\${cookie-domain}")
    val cookieDomain: String? = null
}
