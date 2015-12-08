package me.dilee.retrofitdemo.api;

import me.dilee.retrofitdemo.model.GitModel;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by dileesha on 12/8/15.
 */
public interface GitApi {

    @GET("/users/{user}")
    public void getFeed(@Path("user") String user, Callback<GitModel> response);

}
