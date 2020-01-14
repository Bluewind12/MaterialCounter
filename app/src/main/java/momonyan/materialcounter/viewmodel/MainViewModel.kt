package momonyan.materialcounter.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.room.Room
import momonyan.materialcounter.repository.MaterialDataBase

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val database =
        Room.databaseBuilder(application, MaterialDataBase::class.java, "Materials").build()

    fun addData() {
        Log.d("TEST", "FABClick")
    }
}