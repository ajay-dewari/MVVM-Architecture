package com.dewari.ajay.myapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PageMap {
    @SerializedName("cse_image")
    private List<CseImage> cseImage;

    public List<CseImage> getCseImage() {
        return cseImage;
    }

    public void setCseImage(List<CseImage> cseImage) {
        this.cseImage = cseImage;
    }
}
