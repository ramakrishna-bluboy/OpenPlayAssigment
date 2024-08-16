package com.example.openplayassigment

import android.app.Application
import com.example.openplayassigment.data.MovieApiService
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApp : Application()

class MovieRepository @Inject constructor(
    private val apiService: MovieApiService
) {

}


