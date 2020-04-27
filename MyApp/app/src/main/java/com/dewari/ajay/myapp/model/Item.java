package com.dewari.ajay.myapp;

import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("title")
    private String title;
    @SerializedName("snippet")
    private String snippet;
    @SerializedName("pagemap")
    private PageMap pagemap;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public PageMap getPagemap() {
        return pagemap;
    }

    public void setPagemap(PageMap pagemap) {
        this.pagemap = pagemap;
    }
}
