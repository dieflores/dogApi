package com.desafiolatam.dogbreed.api;

// CUARTO PASO CREAR RETROFIT Y LA INTERFACE PARA NUESTROS DATOS.
// url end point

import com.desafiolatam.dogbreed.model.BreedImageListResponse;
import com.desafiolatam.dogbreed.model.BreedListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiDog {

    @GET("api/breeds/list")
    Call<BreedListResponse> getBreedList();

    @GET("api/breed/{breed}/images/")
    Call<BreedImageListResponse>getBreedImageList(@Path("breed") String breed);

}


