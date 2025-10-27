package db.model.entity
import db.base.AuditListener
import db.base.FullAudit
import db.model.common.UomType
import jakarta.persistence.*
import db.model.entity.issue

data class issueType(
    @Id
    @Column(name = "issue_id")
    var issueId: String? = null,
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_id")
    var issueType_issue: issue? = null,

    @Column(name = "issue_type")
    var issueType: String? = null,


    ): FullAudit()
