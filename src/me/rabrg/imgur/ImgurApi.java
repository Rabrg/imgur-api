package me.rabrg.imgur;

import me.rabrg.imgur.response.Response;
import me.rabrg.imgur.response.model.Image;
import me.rabrg.imgur.service.ImageService;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

import java.lang.reflect.Field;

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

    public static void main(final String[] args) {
        final Image image = new ImgurApi("7d86c8075bebaf3").getImage("O6vE8Mx").data;
        Field[] fields = image.getClass().getFields();
        for(Field f : fields){
            try {
                Object v = f.get(image);
                System.out.println(f.getName() + " " + v);
            } catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Response<Image> getImage(final String id) {
        return imageService.getImage(id);
    }
}
