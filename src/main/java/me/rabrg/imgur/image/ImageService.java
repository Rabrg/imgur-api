package me.rabrg.imgur.image;

import me.rabrg.imgur.Model;
import retrofit2.Call;
import retrofit2.http.*;

public interface ImageService {

    @GET("image/{id}")
    Call<Model<Image>> image(@Path("id") String id);

    @PUT("upload")
    Call<Model<Image>> upload(@Query("image") String image, @Query("album") String album, @Query("type") String type,
                              @Query("name") String name, @Query("title") String title,
                              @Query("description") String description);

    @DELETE("image/{id}")
    Call<Model<Boolean>> delete(@Path("id") String id);

    @PUT("image/{id}")
    Call<Model<Boolean>> update(@Path("id") String id, @Query("title") String title,
                                @Query("description") String description);
}
