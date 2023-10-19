package com.jamirodev.horoscopoapp.ui.luck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jamirodev.horoscopoapp.databinding.FragmentLuckBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LuckFragment : Fragment() {

    private var _binding: FragmentLuckBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()
    }

    private fun initUi() {
        initListeners()
    }

    private fun initListeners() {
        binding.ivRoulette.setOnClickListener{ spinRoulette() }
    }

    private fun spinRoulette() {
        TODO("Not yet implemented")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}