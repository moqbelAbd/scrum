package db.model.entity

import db.base.AuditListener
import db.base.FullAudit
import db.model.common.UomType
import jakarta.persistence.*



data class roleType(

    @Id
    @Column(name = "role_id")
    var roleId: String? = null,

    @Column(name = "role")
    var role: String? = null, //enum

    ): FullAudit()
