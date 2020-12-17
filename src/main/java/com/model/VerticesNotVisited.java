
package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The type Vertices not visited.
 */
public class VerticesNotVisited {

    @SerializedName("modelName")
    @Expose
    private String modelName;
    @SerializedName("vertexName")
    @Expose
    private String vertexName;
    @SerializedName("vertexId")
    @Expose
    private String vertexId;

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
     * Gets vertex name.
     *
     * @return the vertex name
     */
    public String getVertexName() {
        return vertexName;
    }

    /**
     * Sets vertex name.
     *
     * @param vertexName the vertex name
     */
    public void setVertexName(String vertexName) {
        this.vertexName = vertexName;
    }

    /**
     * Gets vertex id.
     *
     * @return the vertex id
     */
    public String getVertexId() {
        return vertexId;
    }

    /**
     * Sets vertex id.
     *
     * @param vertexId the vertex id
     */
    public void setVertexId(String vertexId) {
        this.vertexId = vertexId;
    }

}
