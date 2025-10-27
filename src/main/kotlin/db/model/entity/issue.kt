package db.model.entity
import db.base.AuditListener
import db.base.FullAudit
import db.model.common.UomType
import jakarta.persistence.*
import db.model.entity.productBacklog
import db.model.entity.state

@Entity
@EntityListeners(AuditListener::class)
@Table

data class issue(
    @Id
    @Column(name = "issue_id")
    var issueId: String? = null,

    @Column(name = "issue_title")
    var issueTitle: String? = null,

    @Column(name = "issue_description")
    var issueDescription: Long? = null,

    @Column(name = "acceptence_criteria")
    var acceptenceCriteria: String? = null,

    @Column(name = "estimated_Points")
    var estimatedPoints: String? = null,

    @Column(name = "productBacklog_id")
    var productBacklog: String? = null,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productBacklog_id")
    var issue_backlog: productBacklog? = null,

    @Column(name = "state_id")
var state: String? = null, //enum
@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "state-id")
var issue_state: state? = null

): FullAudit()