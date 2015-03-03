package me.rabrg.imgur;

import me.rabrg.imgur.response.Response;
import me.rabrg.imgur.response.model.Basic;
import me.rabrg.imgur.response.model.Image;
import me.rabrg.imgur.service.ImageService;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

/**
 * The core class of the Imgur API.
 * @author Ryan Greene
 */
public class ImgurApi {

    private final RestAdapter restAdapter;
    private final ImageService imageService;

    /**
     * Constructs a new ImgurApi with the specified clientId.
     * @param clientId The client id.
     */
    public ImgurApi(final String clientId) {
        this.restAdapter = new RestAdapter.Builder().setEndpoint("https://api.imgur.com/3").setRequestInterceptor(new RequestInterceptor() {
            @Override
            public void intercept(final RequestFacade request) {
                request.addHeader("Authorization", "Client-ID " + clientId);
            }
        }).build();
        this.imageService = restAdapter.create(ImageService.class);
    }

    /**
     * Gets information about an image.
     * @param id The id of the image.
     * @return A response containing information about the image.
     */
    public Response<Image> getImage(final String id) {
        return imageService.getImage(id);
    }

    /**
     * Uploads a new image.
     * @param image A binary file, base64 data, or a URL for the image being uploaded.
     * @param album The id of the album you want to add the image to. For anonymous albums, {album} should be the deletehash that is returned at creation.
     * @param type The type of the file that's being sent; file, base64 or URL
     * @param name The name of the file, this is automatically detected if uploading a file with a POST and multipart / form-data
     * @param title The title of the image.
     * @param description The description of the image.
     * @return A basic response.
     */
    public Response<Basic> uploadImage(final String image, final String album, final String type, final String name, final String title, final String description) {
        return imageService.uploadImage(image, album, type, name, title, description);
    }

    /**
     * Deletes an image. For an anonymous image, {id} must be the image's deletehash. If the image belongs to your account then passing the ID of the image is sufficient.
     * @param id The id of the image. For anonymous images, id should be the deletehash that is returned at creation.
     * @return A basic response.
     */
    public Response<Basic> deleteImage(final String id) {
        return imageService.deleteImage(id);
    }

    /**
     * Updates the title or description of an image. You can only update an image you own and is associated with your account. For an anonymous image, id must be the image's deletehash.
     * @param id The id of the image. For anonymous images, id should be the deletehash that is returned at creation.
     * @param title The title of the image.
     * @param description The description of the image.
     * @return A basic response.
     */
    public Response<Basic> updateImage(final String id, final String title, final String description) {
        return imageService.updateImage(id, title, description);
    }

    /**
     * Favorite an image with the given ID. The user is required to be logged in to favorite the image.
     * @param id The id of the image.
     * @return A basic response.
     */
    public Response<Basic> favoriteImage(final String id) {
        return imageService.favoriteImage(id);
    }
}
