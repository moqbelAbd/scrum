package com.example.scrum.db.model.entity.issue
import db.base.FullAudit
import jakarta.persistence.*

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
