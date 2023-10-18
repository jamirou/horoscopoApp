package com.jamirodev.horoscopoapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jamirodev.horoscopoapp.domain.usecase.GetPredictionUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(private val getPredictionUseCase: GetPredictionUseCase) :
    ViewModel() {

    private var _state = MutableStateFlow<HoroscopeDetailState>(HoroscopeDetailState.Loading)
    val state: StateFlow<HoroscopeDetailState> = _state

    fun getHoroscope(sign: String) {
        viewModelScope.launch {
            _state.value = HoroscopeDetailState.Loading
            val result = withContext(Dispatchers.IO) { getPredictionUseCase(sign) } //SecondaryThread
            if (result!=null) {
                _state.value = HoroscopeDetailState.Success(result.horoscope, result.sign)
            } else{
                _state.value = HoroscopeDetailState.Error("Something has happened, try again later")
            }

        }
    }
}