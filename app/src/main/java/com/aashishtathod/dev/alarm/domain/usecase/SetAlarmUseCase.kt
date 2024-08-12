package com.aashishtathod.dev.alarm.domain.usecase

import com.aashishtathod.dev.alarm.data.model.Alarm
import com.aashishtathod.dev.alarm.domain.repository.AlarmRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class SetAlarmUseCase @Inject constructor(
    private val repository: AlarmRepository
) {

    operator fun invoke(alarm: Alarm) = flow<Unit> {
        val result = repository.createAlarm(alarm)
        emit(result)
    }.flowOn(Dispatchers.IO)

}