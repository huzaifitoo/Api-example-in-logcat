package com.example.apilearning

import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val productsApi = ProductRetrofitClient().getClient()
            .create(ProductsInterface::class.java)

        productsApi.getProducts().enqueue(object : retrofit2.Callback<ProducstsResponseModel>{
            override fun onResponse(
                call: Call<ProducstsResponseModel>,
                response: Response<ProducstsResponseModel>
            ) {
                Log.d("Data", response.body().toString())
            }

            override fun onFailure(call: Call<ProducstsResponseModel>, t: Throwable) {
                t.message?.let { Log.d("error something wrong", it) }
            }
        }

        )
    }
}