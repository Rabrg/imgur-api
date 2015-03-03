package me.rabrg.imgur.service;

import me.rabrg.imgur.response.Response;
import me.rabrg.imgur.response.model.Album;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * An interface containing all album related services used by the Retrofit REST client.
 * @author Ryan Greene
 */
public interface AlbumService {

    @GET("/album/{id}")
    Response<Album> getAlbum(@Path("id") String id);
}
