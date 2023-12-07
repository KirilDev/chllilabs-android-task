package com.youngdev.giphysearchapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {

    val api: GiphyAPI by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.giphy.com/v1/gifs")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GiphyAPI::class.java)
    }
}