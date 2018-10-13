package com.example.emily.webservicewithretrofit.Remote;

import com.example.emily.webservicewithretrofit.Model.Ip;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IpService {

    @GET("/")
    Call<Ip> getIp();
}
