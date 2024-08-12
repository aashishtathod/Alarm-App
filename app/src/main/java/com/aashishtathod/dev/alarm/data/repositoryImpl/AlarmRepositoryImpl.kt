package com.aashishtathod.dev.alarm.data.repositoryImpl

import com.aashishtathod.dev.alarm.data.dataSource.local.AlarmLocalDataSource
import com.aashishtathod.dev.alarm.data.model.Alarm
import com.aashishtathod.dev.alarm.domain.repository.AlarmRepository
import javax.inject.Inject

class AlarmRepositoryImpl @Inject constructor(
    private val localDataSource: AlarmLocalDataSource
) : AlarmRepository {

    override suspend fun createAlarm(alarm: Alarm) {
        localDataSource.createAlarm(alarm)
    }
}