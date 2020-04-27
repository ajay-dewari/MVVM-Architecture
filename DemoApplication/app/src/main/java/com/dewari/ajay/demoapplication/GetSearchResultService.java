package com.dewari.ajay.demoapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetDataService {
    @GET("v1")
    Call<List<SearchResult>> getSearchResults(@Query("q") String query,
                                              @Query("cx") String context,
                                              @Query("key") String key);
}
