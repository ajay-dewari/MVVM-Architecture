package com.dewari.ajay.ajay_indihoodapplication.models;


import com.google.gson.annotations.SerializedName;

public class Record {

    @SerializedName(value = "title")
    private String title;

    @SerializedName(value = "Applicant Details")
    private ApplicantDetails applicantDetails;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ApplicantDetails getApplicantDetails() {
        return applicantDetails;
    }

    public void setApplicantDetails(ApplicantDetails applicantDetails) {
        this.applicantDetails = applicantDetails;
    }
}
