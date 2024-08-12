package com.aashishtathod.dev.alarm.data.dataSource.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.aashishtathod.dev.alarm.data.model.Alarm

@Dao
interface AlarmDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createAlarm(alarm: Alarm)
}