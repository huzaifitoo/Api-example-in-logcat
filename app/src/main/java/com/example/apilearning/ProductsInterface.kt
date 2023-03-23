package com.example.apilearning

import retrofit2.Call
import retrofit2.http.GET

interface ProductsInterface {

    @GET("products")
    fun getProducts() : Call<ProducstsResponseModel>
}