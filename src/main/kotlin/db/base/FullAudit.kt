package db.base

import db.model.entity.user
import jakarta.persistence.*
import java.time.ZonedDateTime

@MappedSuperclass
abstract class FullAudit(
    @Column(name = "create_date", columnDefinition = "TIMESTAMPTZ")
    var createDate: ZonedDateTime? = null,

    @Column(name = "update_date", columnDefinition = "TIMESTAMPTZ")
    var updateDate: ZonedDateTime? = null,

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="create_by_id", referencedColumnName = "user_id")
    var createBy: user? = null,

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="update_by_id", referencedColumnName = "user_id")
    var updateBy: user? = null,
)
