package com.aashishtathod.dev.alarm.di

import com.aashishtathod.dev.alarm.data.dataSource.local.AlarmLocalDataSource
import com.aashishtathod.dev.alarm.data.repositoryImpl.AlarmRepositoryImpl
import com.aashishtathod.dev.alarm.domain.repository.AlarmRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideAlarmRepository(alarmLocalDataSource: AlarmLocalDataSource): AlarmRepository {
        return AlarmRepositoryImpl(alarmLocalDataSource)
    }

}