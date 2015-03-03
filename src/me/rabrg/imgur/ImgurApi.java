package me.rabrg.imgur;

import me.rabrg.imgur.response.Response;
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
}
