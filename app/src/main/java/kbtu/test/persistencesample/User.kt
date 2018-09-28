package kbtu.test.persistencesample

import android.arch.persistence.room.*

@Entity(foreignKeys = arrayOf(ForeignKey(entity = Company::class, parentColumns = arrayOf("id"), childColumns = arrayOf("company_id"))))
data class User(

        @PrimaryKey
        var id: Long,

        @ColumnInfo(name = "user_name")
        var name: String,

        @ColumnInfo
        var company_id: Long,


        @Embedded(prefix = "company_")
        var company: Company


)