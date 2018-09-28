package kbtu.test.persistencesample

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Company(

        @PrimaryKey
        var id: Long,

        @ColumnInfo(name = "company_name")
        var name: String
)