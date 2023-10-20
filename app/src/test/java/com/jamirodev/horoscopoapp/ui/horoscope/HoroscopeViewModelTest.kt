package com.jamirodev.horoscopoapp.ui.horoscope

import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest{

    private lateinit var viewModel: HoroscopeViewModel
    @Before
    fun setUp() {
    }

    @Test
    fun `when viewModel is created then horoscopes are created`() {
        viewModel = HoroscopeViewModel()
    }
}