package com.nprblmm.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=bb8fd39ad30fec08160940c449451935")
    fun getMovieList(): Call<MovieResponse>
}