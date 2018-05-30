package com.example.annis.apps.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by annis on 04/05/2018.
 */

public interface ApiService {
    @GET()
    Call<JsonList>getData(@Url String url);

    @GET()
    Call<JsonList>getRekap(@Url String url);

}
