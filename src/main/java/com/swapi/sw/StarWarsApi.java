package com.swapi.sw;

import com.swapi.APIConstants;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author Zygimantus
 */
public class StarWarsApi {

    private StarWars mSwApi;
    private static StarWarsApi sInstance;

    private StarWarsApi() {

        final Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl(APIConstants.BASE_URL)
                .client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mSwApi = restAdapter.create(StarWars.class);
    }

    public static void init() {
        sInstance = new StarWarsApi();
    }

    public static StarWars getApi() {
        return sInstance.mSwApi;
    }

    public void setApi(StarWars starWarsApi) {
        sInstance.mSwApi = starWarsApi;
    }
}
