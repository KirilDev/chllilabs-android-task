package com.youngdev.giphysearchapp


import retrofit2.Response
import retrofit2.http.GET

interface GiphyAPI {

    @GET("/search?api_key=q4MGLtp1Eoh27LCsupk5d6BblqGXatRQ&q=TEST&limit=25&offset=0&rating=g&lang=en&bundle=messaging_non_clips")
    fun getGifs(): Response<List<GiphyElement>>
}