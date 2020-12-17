package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RestartModel {


    @SerializedName("result")
    @Expose
    private String result;

    public RestartModel(String result) {
        this.result = result;
    }

    public RestartModel() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
