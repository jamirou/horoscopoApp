package com.jamirodev.horoscopoapp.domain

import com.jamirodev.horoscopoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}