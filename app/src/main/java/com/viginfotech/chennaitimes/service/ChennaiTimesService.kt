package com.viginfotech.chennaitimes.service

import com.viginfotech.chennaitimes.model.Feed
import com.viginfotech.chennaitimes.model.Feeds
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ChennaiTimesService{

    @GET("_ah/api/chennaiTimesApi/v1/digitalHuntHeadLines")
    fun getHeadLines(): Call<Feeds>
    @GET("_ah/api/chennaiTimesApi/v1/digitalHuntTamilNadu")
    fun getTamilNadu(): Call<Feeds>
    @GET("_ah/api/chennaiTimesApi/v1/digitalHuntIndia")
    fun getIndiaFeeds(): Call<Feeds>
    @GET("_ah/api/chennaiTimesApi/v1/digitalHuntWorld")
    fun getWorldFeeds(): Call<Feeds>
    @GET("_ah/api/chennaiTimesApi/v1/digitalHuntBusiness")
    fun getBusinessFeeds(): Call<Feeds>
    @GET("_ah/api/chennaiTimesApi/v1/digitalHuntSports")
    fun getSportsFeeds(): Call<Feeds>
    @GET("_ah/api/chennaiTimesApi/v1/digitalHuntCinema")
    fun getCinemaFeeds(): Call<Feeds>
    @GET("_ah/api/chennaiTimesApi/v1/digitalHunt")
    fun getNewsDetail(@Query("category")category: Int,
                      @Query("guid")guid:String,
                      @Query("source")source:Int
    ):Call<Feed>

}
