package com.aashishtathod.dev.alarm.data.dataSource.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aashishtathod.dev.alarm.data.model.Alarm

@Database(entities = [Alarm::class], version = 1)
abstract class AlarmDatabase : RoomDatabase() {

    abstract val alarmDao: AlarmDao
}