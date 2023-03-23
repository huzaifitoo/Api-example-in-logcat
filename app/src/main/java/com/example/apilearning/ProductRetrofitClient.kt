package com.example.apilearning

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ProductRetrofitClient {


    private lateinit var retrofit: Retrofit

    fun getClient(): Retrofit {
        retrofit = Retrofit
            .Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit
    }
}
