package com.techbytecare.kk.uberclone.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by kundan on 12/29/2017.
 */

public interface IGoogleAPI {

    @GET
    Call<String> getPath(@Url String url);
}
