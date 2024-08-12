package com.aashishtathod.dev.alarm.domain.repository

import com.aashishtathod.dev.alarm.data.model.Alarm

interface AlarmRepository {

    suspend fun createAlarm(alarm: Alarm)
}