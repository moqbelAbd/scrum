package db.model.entity

import db.base.AuditListener
import db.base.FullAudit
import db.model.common.UomType
import jakarta.persistence.*
import db.model.entity.project

data class productBacklog(

@Id
@Column(name = "productBacklog_id")
var productBacklogId: String? = null,

@Column(name = "project_id")
var projecId: String? = null,
@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "project_id")
var backlog_project: project? = null,

): FullAudit()

