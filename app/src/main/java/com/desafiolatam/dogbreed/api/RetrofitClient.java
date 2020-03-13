package com.desafiolatam.dogbreed.api;

//  QUINTO CREAMOS CLIENTE RETROFIT A PARTIOR DE PROYECTOS ANTERIORESS (ESTE ES EL GSON CONVERTER)
// luego al manifest le agregamos, se agrego android:usesCleartextTraffic="true"

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class RetrofitClient {

    private static Retrofit retrofit;

    private static  final String BASE_URL = "https://dog.ceo/";

    public static Retrofit getRetrofitInstance() {

        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    //gson converter
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
