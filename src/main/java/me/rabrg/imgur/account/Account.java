package me.rabrg.imgur.account;

import com.google.gson.annotations.SerializedName;

public final class Account {

    private int id;
    private String url;
    private String bio;
    private float reputation;
    private long created;
    @SerializedName("proExpiration")
    private Object proExpiration;

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getBio() {
        return bio;
    }

    public float getReputation() {
        return reputation;
    }

    public long getCreated() {
        return created;
    }

    public Object getProExpiration() {
        return proExpiration;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", bio='" + bio + '\'' +
                ", reputation=" + reputation +
                ", created=" + created +
                ", proExpiration=" + proExpiration +
                '}';
    }
}
