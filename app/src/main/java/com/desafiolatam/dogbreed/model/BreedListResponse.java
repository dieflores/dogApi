package com.desafiolatam.dogbreed.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BreedListResponse {
    // SEGUNDO PASO DE APP APARTIR DEL JSON CREAMOS ATRIBUTOS Y PARAMETROS (MESSAGE , STATUS)  THIS POJO y response 1

    @SerializedName("message")
    private List<String> breedList;
    private String status;

    public List<String> getBreedList() {
        return breedList;
    }

    public void setBreedList(List<String> breedList) {
        this.breedList = breedList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
