package com.example.guest.moviefone;

import android.util.Log;



import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Guest on 4/27/16.
 */
public class MovieService {
    public static void findMovies(String title, Callback callback){
        String CONSUMER_KEY = Constants.MOVIE_DATABASE_KEY;
        OkHttpClient client = new OkHttpClient.Builder().build();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.MOVIE_DB_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.MOVIE_DB_QUERY_PARAMETER, CONSUMER_KEY);
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder().url(url).build();

        Call call = client.newCall(request);
        call.enqueue(callback);


    }
}
