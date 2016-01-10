package me.rabrg.imgur.account;

import me.rabrg.imgur.Model;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AccountService {

    @GET("account/{username}")
    Call<Model<Account>> account(@Path("username") String username);
}
