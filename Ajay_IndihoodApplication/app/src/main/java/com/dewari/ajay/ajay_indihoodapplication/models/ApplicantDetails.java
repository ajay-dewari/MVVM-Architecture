package com.dewari.ajay.ajay_indihoodapplication.models;


import com.google.gson.annotations.SerializedName;

import java.util.Set;

public class ApplicantDetails {

    @SerializedName(value = "Name")
    private String name;

    @SerializedName(value = "Date of Birth")
    private String DOB;

    @SerializedName(value = "Marital Status")
    private String maritalStatus;

    @SerializedName(value = "No of Dependents")
    private int noOfDependents;

    @SerializedName(value = "Phone Number")
    private Set<String> phoneNumbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getNoOfDependents() {
        return noOfDependents;
    }

    public void setNoOfDependents(int noOfDependents) {
        this.noOfDependents = noOfDependents;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
