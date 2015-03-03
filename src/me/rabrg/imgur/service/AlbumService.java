package me.rabrg.imgur.service;

import me.rabrg.imgur.response.Response;
import me.rabrg.imgur.response.model.Album;
import me.rabrg.imgur.response.model.Image;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * An interface containing all album related services used by the Retrofit REST client.
 * @author Ryan Greene
 */
public interface AlbumService {

    @GET("/album/{id}")
    Response<Album> getAlbum(@Path("id") String id);

    @GET("/album/{albumId}/{imageId}")
    Response<Image> getAlbumImage(@Path("albumId") String albumId, @Path("imageId") String imageId);
}
