package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The type Data.
 */
public class Data {

    @SerializedName("YEdContext")
    @Expose
    private String yEdContext;

    /**
     * Gets y ed context.
     *
     * @return the y ed context
     */
    public String getYEdContext() {
        return yEdContext;
    }

    /**
     * Sets y ed context.
     *
     * @param yEdContext the y ed context
     */
    public void setYEdContext(String yEdContext) {
        this.yEdContext = yEdContext;
    }
}