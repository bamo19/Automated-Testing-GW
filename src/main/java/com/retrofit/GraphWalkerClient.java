package com.retrofit;

import com.model.*;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class GraphWalkerClient {

    private String BaseURL="http://localhost:8887/graphwalker/";
    private GraphWalkerService service;

    GetStatisticsModel getStatisticsModel;
    RestartModel restartModel;

    public GraphWalkerClient() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8887/graphwalker/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service= retrofit.create(GraphWalkerService.class);

    }

    public boolean hasNext() throws InterruptedException, IOException {
        Call<HasNextModel> repos = service.hasNext();
        return repos.execute().body().getHasNext().equalsIgnoreCase("true");
    }


    public String getNext() throws InterruptedException, IOException {
        Call<GetNextModel> repos = service.getNext();
        return repos.execute().body().getCurrentElementName();
    }


    public String getData() throws InterruptedException, IOException {
        Call<GetDataModel> repos = service.getData();
        return repos.execute().body().getResult();
    }



    public GetStatisticsModel getStatistics() throws InterruptedException, IOException {
        Call<GetStatisticsModel> repos = service.getStatistics();
        return repos.execute().body();
    }

    public RestartModel restart() throws InterruptedException, IOException {
        Call<RestartModel> repos = service.restart();
        return repos.execute().body();
    }



}
