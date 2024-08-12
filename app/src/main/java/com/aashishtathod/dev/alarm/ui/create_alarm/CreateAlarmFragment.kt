package com.aashishtathod.dev.alarm.ui.create_alarm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aashishtathod.dev.alarm.R

class CreateAlarmFragment : Fragment() {
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CreateAlarmFragment().apply {
                arguments = Bundle().apply {
                   // putString(ARG_PARAM1, param1)
                }
            }
    }
}