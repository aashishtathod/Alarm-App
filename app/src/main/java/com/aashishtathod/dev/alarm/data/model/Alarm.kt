package com.aashishtathod.dev.alarm.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Alarm(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name: String,
    val time: Long
)
