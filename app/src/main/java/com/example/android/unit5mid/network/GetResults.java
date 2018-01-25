package com.example.android.unit5mid.network;

import com.example.android.unit5mid.model.Results;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by TatianaM on 1/24/18.
 */

public interface GetResults {

    @GET("?nat=us&inc=name,location,cell,email,dob,picture&results=20")
    Call<Results> getResultsNetwork();
}
