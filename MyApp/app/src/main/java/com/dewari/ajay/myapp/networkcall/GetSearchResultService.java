package com.dewari.ajay.myapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetSearchResultService {
    @GET("v1")
    Call<SearchResult> getSearchResults(@Query("q") String query,
                                        @Query("cx") String context,
                                        @Query("key") String key);
}
