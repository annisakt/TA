package com.example.annis.apps.api;

/**
 * Created by annis on 04/05/2018.
 */
import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UtilsApi {


    public static final String BASE_URL = "http://simonir.com/api/";
    private static Retrofit retrofit = null;
    // variable to hold context
    private static Context context;
    public static ApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL).create(ApiService.class);
    }

    public static Retrofit getClient() {
//        OkHttpClient client = new OkHttpClient.Builder()
//                .addInterceptor(new Connectivity(context))
//                .build();
        if (retrofit == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}