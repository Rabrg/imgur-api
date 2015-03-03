package me.rabrg.imgur.service;

import me.rabrg.imgur.response.Response;
import me.rabrg.imgur.response.model.Basic;
import me.rabrg.imgur.response.model.Image;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface ImageService {

    @GET("/image/{id}")
    Response<Image> getImage(@Path("id") String id);

    @POST("/upload")
    Response<Basic> uploadImage(@Path("image") String image, @Path("album") String album, @Path("type") String type, @Path("name") String name, @Path("title") String title, @Path("description") String description);

    @DELETE("/image/{id}")
    Response<Basic> deleteImage(@Path("id") String id);

    @POST("/image/{id}")
    Response<Basic> updateImage(@Path("title") String title, @Path("description") String description);

    @DELETE("/image/{id}/favorite")
    Response<Basic> favoriteImage(@Path("id") String id);
}
