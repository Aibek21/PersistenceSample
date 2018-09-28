package kbtu.test.persistencesample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlin.concurrent.thread

class RoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val user = User(1, "Bob")

        thread {
            val userDao = (applicationContext as MyApp).database.userDao()

            (applicationContext as MyApp).database.runInTransaction(object : Runnable {

                override fun run() {
//                    userDao.insertUser(user)
                    val users = userDao.getUsers()

                    for (u in users) {
                        Log.d("User", u.name)
                    }
                }
            })
        }

    }
}
