package com.example.scrum.db.model.entity
//import db.utils.LangAttribute
//import db.base.LangAttributeConverter
import db.base.AuditListener
import db.base.FullAudit
import jakarta.persistence.*


@Entity
@EntityListeners(AuditListener::class)
@Table
data class user (
    @Id
    @Column(name = "user_id")
    var userId: String? = null,

    @Column(name = "photo")
    var photo: Long? = null, //blob

    @Column(name = "email")
    var email: String? = null,

    @Column(name = "password")
    var password: String? = null,


    ): FullAudit()
