package com.aashishtathod.dev.alarm.data.dataSource.local

import com.aashishtathod.dev.alarm.data.dataSource.database.AlarmDatabase
import com.aashishtathod.dev.alarm.data.model.Alarm
import javax.inject.Inject

class AlarmLocalDataSource @Inject constructor(
    private val alarmDatabase: AlarmDatabase
) {
    suspend fun createAlarm(alarm: Alarm) {
        alarmDatabase.alarmDao.createAlarm(alarm)
    }
}