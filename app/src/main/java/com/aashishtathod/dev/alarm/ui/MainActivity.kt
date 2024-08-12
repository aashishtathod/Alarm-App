package com.aashishtathod.dev.alarm.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.aashishtathod.dev.alarm.R
import com.aashishtathod.dev.alarm.databinding.ActivityMainBinding
import com.aashishtathod.dev.alarm.ui.alarms.AlarmListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<AlarmListFragment>(R.id.container)
        }


    }
}