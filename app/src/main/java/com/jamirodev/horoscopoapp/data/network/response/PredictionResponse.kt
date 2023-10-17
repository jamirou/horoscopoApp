package com.jamirodev.horoscopoapp.data.network.response

import com.google.gson.annotations.SerializedName

data class PredictionResponse(
    @SerializedName("date") val date:String,
    @SerializedName("horoscope") val horoscope:String,
    @SerializedName("sign") val sign:String,
)