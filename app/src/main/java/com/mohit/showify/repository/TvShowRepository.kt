package com.mohit.showify.repository

import com.mohit.showify.api.ApiService
import javax.inject.Inject

class TvShowRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getTvShows() = apiService.getTvShows()
}