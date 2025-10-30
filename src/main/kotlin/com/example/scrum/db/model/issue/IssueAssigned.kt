package com.example.scrum.db.model.entity.issue
import com.example.scrum.db.model.entity.user
import db.base.FullAudit
import jakarta.persistence.*

data class issueAssigned(
    @Id
    @Column(name = "user_id")
    var userId: String? = null,
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    var issueAssign_user: user? = null,
    //composite
    @Id
@Column(name = "issue_id")
var issueId: String? = null,
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_id")
    var issueAssign_issue: issue? = null,


    @Column(name = "task_title")
    var taskTitle: String? = null,

    ): FullAudit()



