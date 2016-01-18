package me.rabrg.imgur;

import java.io.IOException;
import java.util.Scanner;

public final class OAuthTest {

    public static void main(final String[] args) throws IOException {
        final ImgurAPI api = new ImgurAPI("client id", "client secret");
        final Scanner scanner = new Scanner(System.in);

        // The authorization URL to redirect the user to
        System.out.println(api.getAuthorizationURL());

        // Create the access token using the authorization pin the user received
        api.authorize(scanner.nextLine());

        // Test the access token
        System.out.println(api.getAccount("me"));
    }
}
