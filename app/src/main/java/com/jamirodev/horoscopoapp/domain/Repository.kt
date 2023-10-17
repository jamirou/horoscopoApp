package com.jamirodev.horoscopoapp.domain

interface Repository {
    suspend fun getPrediction(sign:String)
}