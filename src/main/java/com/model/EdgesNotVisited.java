
package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The type Edges not visited.
 */
public class EdgesNotVisited {

    @SerializedName("modelName")
    @Expose
    private String modelName;
    @SerializedName("edgeId")
    @Expose
    private String edgeId;
    @SerializedName("edgeName")
    @Expose
    private String edgeName;

    /**
     * Gets model name.
     *
     * @return the model name
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets model name.
     *
     * @param modelName the model name
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * Gets edge id.
     *
     * @return the edge id
     */
    public String getEdgeId() {
        return edgeId;
    }

    /**
     * Sets edge id.
     *
     * @param edgeId the edge id
     */
    public void setEdgeId(String edgeId) {
        this.edgeId = edgeId;
    }

    /**
     * Gets edge name.
     *
     * @return the edge name
     */
    public String getEdgeName() {
        return edgeName;
    }

    /**
     * Sets edge name.
     *
     * @param edgeName the edge name
     */
    public void setEdgeName(String edgeName) {
        this.edgeName = edgeName;
    }

}
