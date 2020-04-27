package com.dewari.ajay.myapp;

import com.google.gson.annotations.SerializedName;

public class CseImage {

    @SerializedName("src")
    private String imageSource;


    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }
}
