package com.dewari.ajay.myapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static Retrofit retrofit;
    private static final String URL = "https://www.googleapis.com/customsearch/";
    public static final String CX = "011476162607576381860:ra4vmliv9ti";
    public static final String API_KEY = "AIzaSyAjTPFgulkdrELcWmo1jAa8wqtHLrztyKc";


    public static Retrofit getRetrofitInstance() {
        if (null == retrofit) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
