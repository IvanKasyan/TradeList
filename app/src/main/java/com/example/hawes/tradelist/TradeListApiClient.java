package com.example.hawes.tradelist;


import java.util.List;

import TradeListResponse.TradeListModel;

public interface TradeListApiClient {

    @GET("api/v1/trades");
    Call<List<TradeListModel>> getData(@Query("")) String

}
