package com.jamirodev.horoscopoapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.jamirodev.horoscopoapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor() : ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value =
            listOf(
                HoroscopeInfo.Aries, HoroscopeInfo.Taurus, HoroscopeInfo.Geminis
            )
    }
}