package momonyan.materialcounter.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.room.Room
import momonyan.materialcounter.repository.MaterialDataBase
import momonyan.materialcounter.repository.MaterialEntity


class MainViewModel(application: Application) : AndroidViewModel(application) {

    val database =
        Room.databaseBuilder(application, MaterialDataBase::class.java, "Materials").build()

    fun addData() {
        Log.d("TEST", "FABClick")
        val materialEntity = MaterialEntity(
            name = "a",
            target_material = 120,
            now_material = 10,
            per_material = 30,
            target_set_flag = true
        )
        Thread(Runnable {
            database.materialDao().addMaterialEntity(materialEntity)
            Log.d("TEST", database.materialDao().getAll().toString())
        }).start()
    }
}