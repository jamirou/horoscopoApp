package com.jamirodev.horoscopoapp.ui.detail

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.navArgs
import com.jamirodev.horoscopoapp.R
import com.jamirodev.horoscopoapp.databinding.ActivityHoroscopeDetailBinding
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Aquarius
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Aries
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Cancer
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Capricorn
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Geminis
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Leo
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Libra
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Pisces
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Sagittarius
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Scorpio
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Taurus
import com.jamirodev.horoscopoapp.domain.model.HoroscopeModel.Virgo
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopeDetailBinding
    private val horoscopeDetailViewModel: HoroscopeDetailViewModel by viewModels()
    private val args: HoroscopeDetailActivityArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
        horoscopeDetailViewModel.getHoroscope(args.type)
    }

    private fun initUI() {
        initListeners()
        initUIState()
    }

    private fun initListeners() {
        binding.ivBack.setOnClickListener { onBackPressed() }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                horoscopeDetailViewModel.state.collect {
                    when (it) {
                        HoroscopeDetailState.Loading -> loadingState()
                        is HoroscopeDetailState.Error -> errorState()
                        is HoroscopeDetailState.Success -> successState(it)
                    }
                }
            }
        }
    }

    private fun loadingState() {
        binding.pb.isVisible = true
    }

    private fun errorState() {
        binding.pb.isVisible = false
    }

    private fun successState(state: HoroscopeDetailState.Success) {
        binding.pb.isVisible = false
        binding.tvTitle.text = state.sign
        binding.tvBody.text = state.prediction

        val image = when(state.horoscopeModel){
            Aries -> R.drawable.detail_aries
            Taurus -> R.drawable.detail_taurus
            Geminis -> R.drawable.detail_gemini
            Cancer -> R.drawable.detail_cancer
            Leo -> R.drawable.detail_cancer
            Capricorn -> R.drawable.detail_cancer
            Scorpio -> R.drawable.detail_scorpio
            Libra -> R.drawable.detail_libra
            Aquarius -> R.drawable.detail_aquarius
            Pisces -> R.drawable.detail_pisces
            Sagittarius -> R.drawable.detail_sagittarius
            Virgo -> R.drawable.detail_virgo
        }
        binding.ivDetail.setImageResource(image)
    }
}