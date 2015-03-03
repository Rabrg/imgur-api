package me.rabrg.imgur.response;

import me.rabrg.imgur.response.model.Model;

public class Response<M extends Model> {

    public M data;

    public boolean success;
    public int status;
}
