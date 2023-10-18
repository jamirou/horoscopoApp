package com.jamirodev.horoscopoapp.data

import android.util.Log
import com.jamirodev.horoscopoapp.data.network.HoroscopeApiService
import com.jamirodev.horoscopoapp.data.network.response.PredictionResponse
import com.jamirodev.horoscopoapp.domain.Repository
import com.jamirodev.horoscopoapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Jamiro", "Something happened: ${it.message}") }
        return null
    }
}