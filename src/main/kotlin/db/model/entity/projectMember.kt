package db.model.entity

import db.base.AuditListener
import db.base.FullAudit
import db.model.common.UomType
import jakarta.persistence.*
import db.model.entity.project
import db.model.entity.user
import db.model.entity.roleType


data class projectMember(
    @Column(name = "project_id")
    var projecId: String? = null,
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    var member_project: project? = null,
    //composite

    @Id
    @Column(name = "user_id")
    var userId: String? = null,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    var member_user: user? = null,

    @Column(name = "role_id")
    var roleId: String? = null,
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    var roleType_member: roleType? = null,

): FullAudit()

