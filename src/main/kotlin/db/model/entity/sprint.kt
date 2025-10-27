package db.model.entity

import db.base.AuditListener
import db.base.FullAudit
import db.model.common.UomType
import jakarta.persistence.*
import db.model.entity.project

data class sprint(
    @Id
    @Column(name = "sprint_id")
    var sprint_Id: String? = null,

    @Column(name = "sprint_title")
    var sprintTitle: String? = null,

    @Column(name = "sprint_description")
    var sprint_Description: String? = null,

    @Column(name = "sprint_start")
    var sprint_Start: String? = null, //date

    @Column(name = "sprint_end")
    var sprint_End: String? = null, //date

    @Column(name = "sprint_number")
    var sprint_Number: Int? = null,

    @Column(name = "project_id")
    var projectId: String? = null,
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "project_id")
    var sprint_project :project? = null,

    ): FullAudit()

