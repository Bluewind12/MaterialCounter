package momonyan.materialcounter.repository

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MaterialEntity constructor(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String,
    val target_material: Long,
    val per_material: Long,
    val now_material: Long,
    val target_set_flag: Boolean
)