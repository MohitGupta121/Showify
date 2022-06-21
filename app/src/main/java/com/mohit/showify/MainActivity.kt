package com.mohit.showify

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mohit.showify.adapter.HomeScreenAdapter
import com.mohit.showify.databinding.ActivityMainBinding
import com.mohit.showify.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val homeViewModel: HomeViewModel by viewModels()
    private lateinit var homeScreenAdapter: HomeScreenAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        setUpRv()
        shimmer()
    }

    private fun shimmer() {
        if (homeViewModel.isLoading) {
            binding.shimmerEffectRv.startShimmer()
            binding.shimmerEffectRvEpisodes.startShimmer()
            binding.shimmerRvRecentlyAdded.startShimmer()

            binding.rvEpisodes.visibility = View.GONE
            binding.rvRecentlyAdded.visibility = View.GONE
            binding.recyclerView.visibility = View.GONE
        }
        homeViewModel.responseTvShow.observe(this) {
            if (!homeViewModel.isLoading) {
                binding.shimmerEffectRv.stopShimmer()
                binding.shimmerEffectRvEpisodes.stopShimmer()
                binding.shimmerRvRecentlyAdded.stopShimmer()

                binding.shimmerEffectRv.visibility = View.GONE
                binding.shimmerEffectRvEpisodes.visibility = View.GONE
                binding.shimmerRvRecentlyAdded.visibility = View.GONE

                binding.rvEpisodes.visibility = View.VISIBLE
                binding.rvRecentlyAdded.visibility = View.VISIBLE
                binding.recyclerView.visibility = View.VISIBLE
            }
        }
    }

    private fun setUpRv() {
        homeScreenAdapter = HomeScreenAdapter()
        binding.recyclerView.apply {
            adapter = homeScreenAdapter
            layoutManager = LinearLayoutManager(
                this@MainActivity, LinearLayoutManager.HORIZONTAL,
                false
            )
            setHasFixedSize(true)
        }

        binding.rvEpisodes.apply {
            adapter = homeScreenAdapter
            layoutManager = LinearLayoutManager(
                this@MainActivity, LinearLayoutManager.HORIZONTAL,
                false
            )
            setHasFixedSize(true)
        }

        binding.rvRecentlyAdded.apply {
            adapter = homeScreenAdapter
            layoutManager = LinearLayoutManager(
                this@MainActivity, LinearLayoutManager.HORIZONTAL,
                false
            )
            setHasFixedSize(true)
        }

        homeViewModel.responseTvShow.observe(this) { listTvShows ->
            homeScreenAdapter.tvShows = listTvShows
        }
    }
}