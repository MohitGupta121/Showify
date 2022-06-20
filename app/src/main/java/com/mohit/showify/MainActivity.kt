package com.mohit.showify

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mohit.showify.adapter.TvShowAdapter
import com.mohit.showify.databinding.ActivityMainBinding
import com.mohit.showify.viewmodel.TvShowViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: TvShowViewModel by viewModels()
    private lateinit var tvShowAdapter: TvShowAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        setUpRv()
        shimmer()
    }

    private fun shimmer() {
        if (viewModel.isLoading) {
            binding.shimmerEffectRv.startShimmer()
            binding.shimmerEffectRvEpisodes.startShimmer()
            binding.shimmerRvRecentlyAdded.startShimmer()

            binding.rvEpisodes.visibility = View.GONE
            binding.rvRecentlyAdded.visibility = View.GONE
            binding.recyclerView.visibility = View.GONE
        }
        viewModel.responseTvShow.observe(this, { isLoading ->
            if (!viewModel.isLoading) {
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
        })
    }

    private fun setUpRv() {
        tvShowAdapter = TvShowAdapter()
        binding.recyclerView.apply {
            adapter = tvShowAdapter
            layoutManager = LinearLayoutManager(
                this@MainActivity, LinearLayoutManager.HORIZONTAL,
                false
            )
            setHasFixedSize(true)
        }

        binding.rvEpisodes.apply {
            adapter = tvShowAdapter
            layoutManager = LinearLayoutManager(
                this@MainActivity, LinearLayoutManager.HORIZONTAL,
                false
            )
            setHasFixedSize(true)
        }

        binding.rvRecentlyAdded.apply {
            adapter = tvShowAdapter
            layoutManager = LinearLayoutManager(
                this@MainActivity, LinearLayoutManager.HORIZONTAL,
                false
            )
            setHasFixedSize(true)
        }

        viewModel.responseTvShow.observe(this, { listTvShows ->
            tvShowAdapter.tvShows = listTvShows
        })
    }
}