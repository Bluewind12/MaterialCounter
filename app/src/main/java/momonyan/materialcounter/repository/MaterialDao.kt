package momonyan.materialcounter.repository

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MaterialDao {

    @Query("SELECT * FROM MaterialEntity")
    fun getAll(): MaterialEntity

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun addMaterialEntity(vararg materialEntity: MaterialEntity)
}