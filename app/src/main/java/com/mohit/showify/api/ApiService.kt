package com.mohit.showify.api

import com.mohit.showify.helper.Constants
import com.mohit.showify.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShows():Response<TvShowResponse>

}