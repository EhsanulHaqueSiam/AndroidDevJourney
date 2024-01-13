package com.example.lesson48_countryname.service;

import com.example.lesson48_countryname.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountryDataService {
    // Retrofit Interface

    @GET("countries")
    Call<Result> getResult();

}
