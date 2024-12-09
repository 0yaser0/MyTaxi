package com.cmc.mytaxi.data.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "drivers")
data class Driver(

    @PrimaryKey(autoGenerate = true) val driverId: Int = 1,
    val firstName: String,
    val lastName: String,
    val age: Int,
    val permiType: String

    )