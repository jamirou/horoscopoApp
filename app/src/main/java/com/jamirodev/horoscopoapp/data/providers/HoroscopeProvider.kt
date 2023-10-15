package com.jamirodev.horoscopoapp.data.providers

import com.jamirodev.horoscopoapp.domain.model.HoroscopeInfo
import com.jamirodev.horoscopoapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject


class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Geminis,
            Cancer,
            Leo,
            Capricorn,
            Scorpio,
            Libra,
            Aquarius,
            Pisces,
            Sagittarius,
            Virgo
        )
    }
}