package db.model.entity
import db.base.AuditListener
import db.base.FullAudit
import db.model.common.UomType
import jakarta.persistence.*
import db.model.entity.state

data class project(
    @Id
    @Column(name = "project_id")
    var projecId: String? = null,

    @Column(name = "project_name")
    var projecName: String? = null,

    @Column(name = "project_description")
    var projecDescription: String? = null,

    @Column(name = "start-date")
    var StartDate: Long? = null,//date

    @Column(name = "end-date")
    var endDate: Long? = null, //date

    @Column(name = "workHours")
    var workHours: Int? = null,

    @Column(name = "state")
    var state: Long? = null, //enum
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "state-id")
//    var project_state: state? = null


    ): FullAudit()
