package com.jamirodev.horoscopoapp.domain

import com.jamirodev.horoscopoapp.data.network.response.PredictionResponse

interface Repository {
    suspend fun getPrediction(sign:String): PredictionResponse?
}