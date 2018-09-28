package kbtu.test.persistencesample

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase


@Database(entities = arrayOf(User::class), version = 1)
abstract class ProjectDatabase : RoomDatabase(){

    abstract fun userDao(): UserDao

}