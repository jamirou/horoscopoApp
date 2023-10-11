package com.jamirodev.horoscopoapp.ui.horoscope

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jamirodev.horoscopoapp.R
import com.jamirodev.horoscopoapp.databinding.FragmentHoroscopeBinding

class HoroscopeFragment : Fragment() {

    private var _binding:FragmentHoroscopeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}