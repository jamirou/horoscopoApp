package com.jamirodev.horoscopoapp.data.providers

import com.jamirodev.horoscopoapp.domain.model.HoroscopeInfo
import com.jamirodev.horoscopoapp.domain.model.HoroscopeInfo.*


class HoroscopeProvider {
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