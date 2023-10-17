package com.jamirodev.horoscopoapp.data

import com.jamirodev.horoscopoapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor() :Repository {
    override suspend fun getPrediction(sign: String) {

    }
}