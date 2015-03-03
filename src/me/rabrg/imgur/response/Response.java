package me.rabrg.imgur.response;

import me.rabrg.imgur.response.model.Model;

/**
 * Represents a single response from a request.
 * @param <M> The data model returned with the response.
 * @author Ryan Greene
 */
public class Response<M extends Model> {

    /**
     * The data model returned with the response.
     */
    public M data;

    /**
     * Whether or not the request was a success.
     */
    public boolean success;

    /**
     * The status code returned from the request.
     */
    public int status;
}
