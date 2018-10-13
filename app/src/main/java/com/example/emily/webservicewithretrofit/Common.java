package com.example.emily.webservicewithretrofit;

import com.example.emily.webservicewithretrofit.Remote.IpService;
import com.example.emily.webservicewithretrofit.Remote.RetrofitClient;

public class Common {

    private static final String BASE_URL = "http://ip.jsontest.com/";

    public static IpService getIpService() {
        return RetrofitClient.getClient(BASE_URL).create(IpService.class);
    }
}
