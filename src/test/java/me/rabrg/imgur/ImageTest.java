package me.rabrg.imgur;

import java.io.IOException;

public final class ImageTest {

    public static void main(final String[] args) throws IOException {
        final ImgurAPI api = new ImgurAPI("client id", "client secret");

        // Upload an image from a URL
        System.out.println(api.uploadImage("https://www.google.com/images/nav_logo242.png"));

        // Upload an image from a InputStream
        System.out.println(api.uploadImage(ImageTest.class.getClassLoader().getResourceAsStream("test_image.png")));

        // Get information about an image
        System.out.println(api.getImage("ggQUrJ9"));
    }
}
