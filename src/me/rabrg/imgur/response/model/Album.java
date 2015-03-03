package me.rabrg.imgur.response.model;

import java.util.List;

/**
 * A class representing the album data model.
 * @author Ryan Greene
 */
public class Album extends Model {

    public String id;
    public String title;
    public String description;
    public long datetime;
    public String cover;
    public int cover_width;
    public int cover_height;
    public String account_url;
    public int account_id;
    public String privacy;
    public String layout;
    public int views;
    public String link;
    public boolean favorite;
    public boolean nsfw;
    public String section;
    public int order;
    public String deletehash;
    public int images_count;
    public List<Image> images;
}
