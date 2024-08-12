package com.aashishtathod.dev.alarm.di

import com.aashishtathod.dev.alarm.data.dataSource.local.AlarmLocalDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

  /*  @Singleton
    @Provides
    fun provideAlarmLocalDataSource(): AlarmLocalDataSource {
        return AlarmLocalDataSource()
    }*/
}