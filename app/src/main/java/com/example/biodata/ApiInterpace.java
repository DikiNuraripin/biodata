package com.example.biodata;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterpace {
    @GET("b046da16")
    Call<DataSiswa> getSiswa();
}
