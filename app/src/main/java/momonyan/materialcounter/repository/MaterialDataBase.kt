package momonyan.materialcounter.repository

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MaterialEntity::class], version = 1)
abstract class MaterialDataBase : RoomDatabase() {
    abstract fun materialDao(): MaterialDao
}