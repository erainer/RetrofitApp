package com.example.emily.webservicewithretrofit.Remote;

import android.content.Context;

import com.example.emily.webservicewithretrofit.R;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit=null;

    public static Retrofit getClient(String baseURL) {
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
