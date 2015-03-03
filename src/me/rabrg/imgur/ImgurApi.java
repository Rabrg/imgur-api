package me.rabrg.imgur;

import me.rabrg.imgur.response.Response;
import me.rabrg.imgur.response.model.Basic;
import me.rabrg.imgur.response.model.Image;
import me.rabrg.imgur.service.ImageService;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

public class ImgurApi {

    private final RestAdapter restAdapter;
    private final ImageService imageService;

    public ImgurApi(final String clientId) {
        this.restAdapter = new RestAdapter.Builder().setEndpoint("https://api.imgur.com/3").setRequestInterceptor(new RequestInterceptor() {
            @Override
            public void intercept(final RequestFacade request) {
                request.addHeader("Authorization", "Client-ID " + clientId);
            }
        }).build();
        this.imageService = restAdapter.create(ImageService.class);
    }

    public Response<Image> getImage(final String id) {
        return imageService.getImage(id);
    }

    public Response<Basic> uploadImage(final String image, final String album, final String type, final String name, final String title, final String description) {
        return imageService.uploadImage(image, album, type, name, title, description);
    }

    public Response<Basic> deleteImage(final String id) {
        return imageService.deleteImage(id);
    }

    public Response<Basic> updateImage(final String title, final String description) {
        return imageService.updateImage(title, description);
    }

    public Response<Basic> favoriteImage(final String id) {
        return imageService.favoriteImage(id);
    }
}
