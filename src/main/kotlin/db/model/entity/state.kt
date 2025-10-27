package db.model.entity

import db.base.AuditListener
import db.base.FullAudit
import db.model.common.UomType
import jakarta.persistence.*
import db.model.entity.issue

data class state(
@Id
@Column(name = "state_id")
var issueId: String? = null,

@Column(name = "state")
var state: String? = null, //enum

): FullAudit()

