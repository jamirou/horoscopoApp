package com.jamirodev.horoscopoapp.data

import com.jamirodev.horoscopoapp.data.network.HoroscopeApiService
import com.jamirodev.horoscopoapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) :Repository {
    override suspend fun getPrediction(sign: String) {
        
    }
}