package com.example.integrationapp.rest;

import com.example.integrationapp.activity.MainActivity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class ApiInterface {

    @GET("movie/top_rated")
    public Call<MainActivity.MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey) {
        return null;
    }

    @GET("movie/{id}")
    void getMoviesDetails(@Path("id") int id, @Query("api_key") String apiKey) {
    }
}
