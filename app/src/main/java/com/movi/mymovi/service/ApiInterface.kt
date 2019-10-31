package com.movi.mymovi.service

import android.os.Parcel
import android.os.Parcelable
import com.movi.mymovi.model.Movie
import com.movi.mymovi.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("movie/latest")
    fun getMovieLatest(@Query("api_key") apiKey : String) : Call<Movie>
    @GET("movie/popular")
    fun getPopularMovie(@Query("api_key") apiKey: String) : Call<MovieResponse>
}