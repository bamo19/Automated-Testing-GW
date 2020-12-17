package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The type Get next model.
 */
public class GetNextModel {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("currentElementName")
    @Expose
    private String currentElementName;

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Gets current element name.
     *
     * @return the current element name
     */
    public String getCurrentElementName() {
        return currentElementName;
    }

    /**
     * Sets current element name.
     *
     * @param currentElementName the current element name
     */
    public void setCurrentElementName(String currentElementName) {
        this.currentElementName = currentElementName;
    }

}