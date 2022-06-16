package com.example.datvexekhach;

import com.example.datvexekhach.models.ResponseChuyenXe;
import com.example.datvexekhach.models.ResponseLoTrinh;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ApiService {
    Gson GSON = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
    final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .readTimeout(1, TimeUnit.MINUTES)
            .connectTimeout(1, TimeUnit.MINUTES)
            .build();
    ApiService API_SERVICE = new Retrofit.Builder()
            .baseUrl("http://api-xe-khach.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create(GSON))
            .client(okHttpClient)
            .build()
            .create(ApiService.class);

    @GET("tour")
    Call<List<ResponseChuyenXe>> getChuyenXe();

    @GET("route")
    Call<List<ResponseLoTrinh>> getLoTrinh();
}
