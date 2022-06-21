package com.mohit.showify.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mohit.showify.models.TvShowItem
import com.mohit.showify.repository.HomeScreenRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel
@Inject
constructor(private val repository: HomeScreenRepository) : ViewModel() {

    var isLoading:Boolean = true

    private val _response = MutableLiveData<List<TvShowItem>>()
    val responseTvShow: LiveData<List<TvShowItem>>
        get() = _response

    init {
        getAllTvShows()
    }

    /**
     * @return response from API
     */
    private fun getAllTvShows() = viewModelScope.launch {
        repository.getTvShows().let {response ->

            if (response.isSuccessful){
                isLoading = false
                _response.postValue(response.body())
            }else{
                Log.d("tag", "getAllTvShows Error: ${response.code()}")
            }
        }
    }

}