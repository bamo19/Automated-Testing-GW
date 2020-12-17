package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The type Has next model.
 */
public class HasNextModel {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("hasNext")
    @Expose
    private String hasNext;

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
     * Gets has next.
     *
     * @return the has next
     */
    public String getHasNext() {
        return hasNext;
    }

    /**
     * Sets has next.
     *
     * @param hasNext the has next
     */
    public void setHasNext(String hasNext) {
        this.hasNext = hasNext;
    }

}