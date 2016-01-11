package me.rabrg.imgur.album;

import me.rabrg.imgur.Model;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;

public interface AlbumService {

    @GET("album/{id}")
    Call<Model<Album>> album(@Part("id") String id);
}
