package com.papb.architecturepractice.services;

import com.papb.architecturepractice.models.DogRandomResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogService {

    @GET("breeds/image/random")
    Call<DogRandomResponse> fetchRandomDog();
}
