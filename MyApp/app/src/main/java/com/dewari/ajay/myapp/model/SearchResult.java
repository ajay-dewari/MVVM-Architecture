package com.dewari.ajay.myapp;

import com.dewari.ajay.myapp.model.Item;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResult {
    @SerializedName("items")
    List<Item> items;

    public SearchResult(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}
