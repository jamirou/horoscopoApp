package com.jamirodev.horoscopoapp.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest{

    @Test
    fun `GetRandomCard should return a random card`(){

        //Given
        val randomCard = RandomCardProvider()

        //When
        val card = randomCard.getLucky()

        //then
        assertNotNull(card)

    }
}