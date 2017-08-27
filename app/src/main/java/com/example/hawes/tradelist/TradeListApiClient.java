package com.example.hawes.tradelist;

import TradeListResponse.TradeListModel;

import TradeListResponse.TradeListModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;



public interface TradeListApiClient {

    @GET("api/v1/trades")
    Call<List<TradeListModel>> getTradeListResponse(@Query("api_key") String api_key);

}
