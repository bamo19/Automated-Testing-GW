
package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The type Get statistics model.
 */
public class GetStatisticsModel {

    @SerializedName("totalFailedNumberOfModels")
    @Expose
    private Integer totalFailedNumberOfModels;
    @SerializedName("totalNotExecutedNumberOfModels")
    @Expose
    private Integer totalNotExecutedNumberOfModels;
    @SerializedName("totalNumberOfUnvisitedVertices")
    @Expose
    private Integer totalNumberOfUnvisitedVertices;
    @SerializedName("verticesNotVisited")
    @Expose
    private List<VerticesNotVisited> verticesNotVisited = null;
    @SerializedName("totalNumberOfModels")
    @Expose
    private Integer totalNumberOfModels;
    @SerializedName("totalCompletedNumberOfModels")
    @Expose
    private Integer totalCompletedNumberOfModels;
    @SerializedName("totalNumberOfVisitedEdges")
    @Expose
    private Integer totalNumberOfVisitedEdges;
    @SerializedName("totalIncompleteNumberOfModels")
    @Expose
    private Integer totalIncompleteNumberOfModels;
    @SerializedName("edgesNotVisited")
    @Expose
    private List<EdgesNotVisited> edgesNotVisited = null;
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("vertexCoverage")
    @Expose
    private Integer vertexCoverage;
    @SerializedName("totalNumberOfEdges")
    @Expose
    private Integer totalNumberOfEdges;
    @SerializedName("totalNumberOfVisitedVertices")
    @Expose
    private Integer totalNumberOfVisitedVertices;
    @SerializedName("edgeCoverage")
    @Expose
    private Integer edgeCoverage;
    @SerializedName("totalNumberOfVertices")
    @Expose
    private Integer totalNumberOfVertices;
    @SerializedName("totalNumberOfUnvisitedEdges")
    @Expose
    private Integer totalNumberOfUnvisitedEdges;

    /**
     * Gets total failed number of models.
     *
     * @return the total failed number of models
     */
    public Integer getTotalFailedNumberOfModels() {
        return totalFailedNumberOfModels;
    }

    /**
     * Sets total failed number of models.
     *
     * @param totalFailedNumberOfModels the total failed number of models
     */
    public void setTotalFailedNumberOfModels(Integer totalFailedNumberOfModels) {
        this.totalFailedNumberOfModels = totalFailedNumberOfModels;
    }

    /**
     * Gets total not executed number of models.
     *
     * @return the total not executed number of models
     */
    public Integer getTotalNotExecutedNumberOfModels() {
        return totalNotExecutedNumberOfModels;
    }

    /**
     * Sets total not executed number of models.
     *
     * @param totalNotExecutedNumberOfModels the total not executed number of models
     */
    public void setTotalNotExecutedNumberOfModels(Integer totalNotExecutedNumberOfModels) {
        this.totalNotExecutedNumberOfModels = totalNotExecutedNumberOfModels;
    }

    /**
     * Gets total number of unvisited vertices.
     *
     * @return the total number of unvisited vertices
     */
    public Integer getTotalNumberOfUnvisitedVertices() {
        return totalNumberOfUnvisitedVertices;
    }

    /**
     * Sets total number of unvisited vertices.
     *
     * @param totalNumberOfUnvisitedVertices the total number of unvisited vertices
     */
    public void setTotalNumberOfUnvisitedVertices(Integer totalNumberOfUnvisitedVertices) {
        this.totalNumberOfUnvisitedVertices = totalNumberOfUnvisitedVertices;
    }

    /**
     * Gets vertices not visited.
     *
     * @return the vertices not visited
     */
    public List<VerticesNotVisited> getVerticesNotVisited() {
        return verticesNotVisited;
    }

    /**
     * Sets vertices not visited.
     *
     * @param verticesNotVisited the vertices not visited
     */
    public void setVerticesNotVisited(List<VerticesNotVisited> verticesNotVisited) {
        this.verticesNotVisited = verticesNotVisited;
    }

    /**
     * Gets total number of models.
     *
     * @return the total number of models
     */
    public Integer getTotalNumberOfModels() {
        return totalNumberOfModels;
    }

    /**
     * Sets total number of models.
     *
     * @param totalNumberOfModels the total number of models
     */
    public void setTotalNumberOfModels(Integer totalNumberOfModels) {
        this.totalNumberOfModels = totalNumberOfModels;
    }

    /**
     * Gets total completed number of models.
     *
     * @return the total completed number of models
     */
    public Integer getTotalCompletedNumberOfModels() {
        return totalCompletedNumberOfModels;
    }

    /**
     * Sets total completed number of models.
     *
     * @param totalCompletedNumberOfModels the total completed number of models
     */
    public void setTotalCompletedNumberOfModels(Integer totalCompletedNumberOfModels) {
        this.totalCompletedNumberOfModels = totalCompletedNumberOfModels;
    }

    /**
     * Gets total number of visited edges.
     *
     * @return the total number of visited edges
     */
    public Integer getTotalNumberOfVisitedEdges() {
        return totalNumberOfVisitedEdges;
    }

    /**
     * Sets total number of visited edges.
     *
     * @param totalNumberOfVisitedEdges the total number of visited edges
     */
    public void setTotalNumberOfVisitedEdges(Integer totalNumberOfVisitedEdges) {
        this.totalNumberOfVisitedEdges = totalNumberOfVisitedEdges;
    }

    /**
     * Gets total incomplete number of models.
     *
     * @return the total incomplete number of models
     */
    public Integer getTotalIncompleteNumberOfModels() {
        return totalIncompleteNumberOfModels;
    }

    /**
     * Sets total incomplete number of models.
     *
     * @param totalIncompleteNumberOfModels the total incomplete number of models
     */
    public void setTotalIncompleteNumberOfModels(Integer totalIncompleteNumberOfModels) {
        this.totalIncompleteNumberOfModels = totalIncompleteNumberOfModels;
    }

    /**
     * Gets edges not visited.
     *
     * @return the edges not visited
     */
    public List<EdgesNotVisited> getEdgesNotVisited() {
        return edgesNotVisited;
    }

    /**
     * Sets edges not visited.
     *
     * @param edgesNotVisited the edges not visited
     */
    public void setEdgesNotVisited(List<EdgesNotVisited> edgesNotVisited) {
        this.edgesNotVisited = edgesNotVisited;
    }

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
     * Gets vertex coverage.
     *
     * @return the vertex coverage
     */
    public Integer getVertexCoverage() {
        return vertexCoverage;
    }

    /**
     * Sets vertex coverage.
     *
     * @param vertexCoverage the vertex coverage
     */
    public void setVertexCoverage(Integer vertexCoverage) {
        this.vertexCoverage = vertexCoverage;
    }

    /**
     * Gets total number of edges.
     *
     * @return the total number of edges
     */
    public Integer getTotalNumberOfEdges() {
        return totalNumberOfEdges;
    }

    /**
     * Sets total number of edges.
     *
     * @param totalNumberOfEdges the total number of edges
     */
    public void setTotalNumberOfEdges(Integer totalNumberOfEdges) {
        this.totalNumberOfEdges = totalNumberOfEdges;
    }

    /**
     * Gets total number of visited vertices.
     *
     * @return the total number of visited vertices
     */
    public Integer getTotalNumberOfVisitedVertices() {
        return totalNumberOfVisitedVertices;
    }

    /**
     * Sets total number of visited vertices.
     *
     * @param totalNumberOfVisitedVertices the total number of visited vertices
     */
    public void setTotalNumberOfVisitedVertices(Integer totalNumberOfVisitedVertices) {
        this.totalNumberOfVisitedVertices = totalNumberOfVisitedVertices;
    }

    /**
     * Gets edge coverage.
     *
     * @return the edge coverage
     */
    public Integer getEdgeCoverage() {
        return edgeCoverage;
    }

    /**
     * Sets edge coverage.
     *
     * @param edgeCoverage the edge coverage
     */
    public void setEdgeCoverage(Integer edgeCoverage) {
        this.edgeCoverage = edgeCoverage;
    }

    /**
     * Gets total number of vertices.
     *
     * @return the total number of vertices
     */
    public Integer getTotalNumberOfVertices() {
        return totalNumberOfVertices;
    }

    /**
     * Sets total number of vertices.
     *
     * @param totalNumberOfVertices the total number of vertices
     */
    public void setTotalNumberOfVertices(Integer totalNumberOfVertices) {
        this.totalNumberOfVertices = totalNumberOfVertices;
    }

    /**
     * Gets total number of unvisited edges.
     *
     * @return the total number of unvisited edges
     */
    public Integer getTotalNumberOfUnvisitedEdges() {
        return totalNumberOfUnvisitedEdges;
    }

    /**
     * Sets total number of unvisited edges.
     *
     * @param totalNumberOfUnvisitedEdges the total number of unvisited edges
     */
    public void setTotalNumberOfUnvisitedEdges(Integer totalNumberOfUnvisitedEdges) {
        this.totalNumberOfUnvisitedEdges = totalNumberOfUnvisitedEdges;
    }

}
