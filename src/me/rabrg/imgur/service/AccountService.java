package me.rabrg.imgur.service;

import me.rabrg.imgur.response.Response;
import me.rabrg.imgur.response.model.Account;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * An interface containing all account related services used by the Retrofit REST client.
 * @author Ryan Greene
 */
public interface AccountService {

    @GET("/account/{username}")
    Response<Account> getAccount(@Path("username") String username);}
