package com.jamirodev.horoscopoapp.domain.model

import com.jamirodev.horoscopoapp.R

sealed class HoroscopeInfo(val img:Int, val name:Int) {
    object Aries:HoroscopeInfo(R.drawable.aries, R.string.aries)
    object Tauro:HoroscopeInfo(R.drawable.tauro, R.string.taurus)
    
}
