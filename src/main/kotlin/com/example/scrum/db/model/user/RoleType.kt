package com.example.scrum.db.model.entity

import com.example.scrum.db.base.AuditListener
import com.example.scrum.db.base.FullAudit
import jakarta.persistence.*



data class roleType(

    @Id
    @Column(name = "role_id")
    var roleId: String? = null,

    @Column(name = "role")
    var role: String? = null, //enum

    ): FullAudit()
