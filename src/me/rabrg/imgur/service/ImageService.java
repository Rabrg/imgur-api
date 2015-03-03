package me.rabrg.imgur.service;

import me.rabrg.imgur.response.Response;
import me.rabrg.imgur.response.model.Image;
import retrofit.http.GET;
import retrofit.http.Path;

public interface ImageService {

    @GET("/image/{id}")
    Response<Image> getImage(@Path("id") String id);
}
