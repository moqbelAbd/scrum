package db.base

class AuditListener {

}
//    @PrePersist
//    fun prePersistOperation(obj: Any) {
//        if (obj is TimeAudit) {
//            obj.createDate = CalendarUtils.now()
//            obj.updateDate = CalendarUtils.now()
//        }
//
//        if (obj is FullAudit) {
//            val userId = SecurityUtil.userId()
//            obj.createDate = CalendarUtils.now()
//            obj.updateDate = CalendarUtils.now()
//            obj.createBy = if (userId == null) null else UserLogin(userId = SecurityUtil.userId())
//            obj.updateBy = if (userId == null) null else UserLogin(userId = SecurityUtil.userId())
//        }
//    }


//    @PreUpdate
//    fun preUpdateOperation(obj: Any) {
//        if (obj is TimeAudit) {
//            obj.updateDate = CalendarUtils.now()
//        }
//
//        if (obj is FullAudit) {
//            val userId = SecurityUtil.userId()
//            obj.updateDate = CalendarUtils.now()
//            obj.updateBy = if (userId == null) null else UserLogin(userId = SecurityUtil.userId())
//        }
//    }
//}
