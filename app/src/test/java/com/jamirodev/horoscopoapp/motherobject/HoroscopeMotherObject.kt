package com.jamirodev.horoscopoapp.motherobject

import com.jamirodev.horoscopoapp.data.network.response.PredictionResponse
import com.jamirodev.horoscopoapp.domain.model.HoroscopeInfo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
        HoroscopeInfo.Aries,
        HoroscopeInfo.Taurus,
        HoroscopeInfo.Geminis,
        HoroscopeInfo.Cancer,
        HoroscopeInfo.Leo,
        HoroscopeInfo.Capricorn,
        HoroscopeInfo.Scorpio,
        HoroscopeInfo.Libra,
        HoroscopeInfo.Aquarius,
        HoroscopeInfo.Pisces,
        HoroscopeInfo.Sagittarius,
        HoroscopeInfo.Virgo
    )
}