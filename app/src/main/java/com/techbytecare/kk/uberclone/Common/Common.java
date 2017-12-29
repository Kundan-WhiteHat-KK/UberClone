package com.techbytecare.kk.uberclone.Common;

import com.techbytecare.kk.uberclone.Remote.IGoogleAPI;
import com.techbytecare.kk.uberclone.Remote.RetrofitClient;

/**
 * Created by kundan on 12/29/2017.
 */

public class Common {

    public static final String baseURL = "https://maps.googleapis.com";

    public static IGoogleAPI getGoogleAPI() {

        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
