package com.example.integrationapp.rest;

import com.example.integrationapp.model.MoviesResponce;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class ApiInterface {

    @GET("movie/top_rated")
    public Call<MoviesResponce> getTopRatedMovies(@Query("api_key") String apiKey) {
        return null;
    }

    @GET("movie/{id}")
    Call<MoviesResponce> getMoviesDetails(@Path("id") int id, @Query("api_key") String apiKey) {
        return null;
    }
}
