package com.desafiolatam.dogbreed;
// EN PASO SEXTO HICIMOS DESDE LINEA 22 HASTA CALL.ENQUEUE(NEW CALLBAK... Y SE GENERO SOLO)

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.desafiolatam.dogbreed.api.ApiDog;
import com.desafiolatam.dogbreed.api.RetrofitClient;
import com.desafiolatam.dogbreed.model.BreedImageListResponse;
import com.desafiolatam.dogbreed.model.BreedListResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    // 7 ahora declaramos perro 1
    private String perro1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiDog service = RetrofitClient.getRetrofitInstance().create(ApiDog.class);
        Call<BreedListResponse> call = service.getBreedList();
        call.enqueue(new Callback<BreedListResponse>() {
            @Override
            public void onResponse(Call<BreedListResponse> call, Response<BreedListResponse> response) {
                List<String> perritos = response.body().getBreedList();
                // 8
                perro1 = perritos.get(0);

                if (!perro1.equals("")) {
                    whoLetTheDogsOut();
                }
            }

            @Override
            public void onFailure(Call<BreedListResponse> call, Throwable t) {

            }
        });

// 9 Crdeamos metodo whoLetDogOut() hasta (new CallBack<BreedImage....se autocompleta) ;

    }

    private void whoLetTheDogsOut() {
        ApiDog service = RetrofitClient.getRetrofitInstance().create(ApiDog.class);
        Call<BreedImageListResponse> callImages = service.getBreedImageList(perro1);
        callImages.enqueue(new Callback<BreedImageListResponse>() {
            @Override
            public void onResponse(Call<BreedImageListResponse> call, Response<BreedImageListResponse> response) {
                List<String> imagesURL = response.body().getImageUrl();
                Log.e("IMAGESDOGS", String.valueOf(imagesURL));
            }

            @Override
            public void onFailure(Call<BreedImageListResponse> call, Throwable t) {
                Log.e("FALLO", String.valueOf(t));

            }
        });


    }
}
