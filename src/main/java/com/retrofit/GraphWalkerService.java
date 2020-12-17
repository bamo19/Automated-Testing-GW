package com.retrofit;

import com.model.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;

public interface GraphWalkerService {

    @GET("hasNext")
    Call<HasNextModel> hasNext();

    @GET("getNext")
    Call<GetNextModel> getNext();

    @GET("getData")
    Call<GetDataModel> getData();

    @GET("getStatistics")
    Call<GetStatisticsModel> getStatistics();


    @PUT("restart")
    Call<RestartModel> restart();

}
