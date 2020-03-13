package com.desafiolatam.dogbreed.model;


// TERCER PASO CREAR RESPONSE PARA IMAGENES // RESPONSE POJO 2 CREAR GETERS Y SETTERS

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BreedImageListResponse {
    @SerializedName("message")
    private List<String> imageUrl;
    private String status;

    public List<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
