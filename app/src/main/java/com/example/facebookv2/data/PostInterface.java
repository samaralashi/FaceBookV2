package com.example.facebookv2.data;

import pojo.PostModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
    @GET("posts")
    public Call<PostModel> getPosts();
}
