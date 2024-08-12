package com.aashishtathod.dev.alarm.ui.alarms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aashishtathod.dev.alarm.databinding.FragmentAlarmListBinding

class AlarmListFragment : Fragment() {

    companion object {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentAlarmListBinding.inflate(inflater)
        return binding.root
    }
}