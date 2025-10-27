package db.model.common

import db.base.AuditListener
//import db.base.LangAttribute
//import db.base.LangAttributeConverter
import jakarta.persistence.Column
import jakarta.persistence.Convert
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.ColumnTransformer

@Entity
@EntityListeners(AuditListener::class)
@Table
data class UomType (
    @Id
    @Column
    var uomTypeId: Int? = null,

//    @Convert(converter = LangAttributeConverter::class)
//    @Column(nullable = false, columnDefinition = "jsonb")
//    @ColumnTransformer(write = "?::jsonb")
//    var name: LangAttribute = LangAttribute()
)
