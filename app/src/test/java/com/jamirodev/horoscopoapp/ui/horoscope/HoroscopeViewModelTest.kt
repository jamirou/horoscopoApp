package com.jamirodev.horoscopoapp.ui.horoscope

import com.jamirodev.horoscopoapp.data.providers.HoroscopeProvider
import com.jamirodev.horoscopoapp.motherobject.HoroscopeMotherObject
import com.jamirodev.horoscopoapp.motherobject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest{

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel
    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewModel is created then horoscopes are created`() {
        every { horoscopeProvider.getHoroscopes() } returns horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty()) 
    }
}