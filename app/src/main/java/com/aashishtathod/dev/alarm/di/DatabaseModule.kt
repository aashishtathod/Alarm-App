package com.aashishtathod.dev.alarm.di

import android.content.Context
import androidx.room.Room
import com.aashishtathod.dev.alarm.data.dataSource.database.AlarmDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideAlarmDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context,
            AlarmDatabase::class.java,
            "AlarmDatabase"
        ).build()
}