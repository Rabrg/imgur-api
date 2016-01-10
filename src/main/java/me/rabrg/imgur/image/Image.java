package me.rabrg.imgur.image;

import com.google.gson.annotations.SerializedName;

public final class Image {

    private String id;
    private String title;
    private String description;
    @SerializedName("datetime")
    private long dateTime;
    private String type;
    private boolean animated;
    private int width;
    private int height;
    private int size;
    private int views;
    private long bandwidth;
    @SerializedName("deletehash")
    private String deleteHash;
    private String name;
    private String section;
    private String link;
    private String gifv;
    private String mp4;
    private String webm;
    private boolean looping;
    private boolean favorite;
    private boolean nsfw;
    private String vote;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public long getDateTime() {
        return dateTime;
    }

    public String getType() {
        return type;
    }

    public boolean isAnimated() {
        return animated;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSize() {
        return size;
    }

    public int getViews() {
        return views;
    }

    public long getBandwidth() {
        return bandwidth;
    }

    public String getDeleteHash() {
        return deleteHash;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public String getLink() {
        return link;
    }

    public String getGifv() {
        return gifv;
    }

    public String getMp4() {
        return mp4;
    }

    public String getWebm() {
        return webm;
    }

    public boolean isLooping() {
        return looping;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public boolean isNsfw() {
        return nsfw;
    }

    public String getVote() {
        return vote;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateTime=" + dateTime +
                ", type='" + type + '\'' +
                ", animated=" + animated +
                ", width=" + width +
                ", height=" + height +
                ", size=" + size +
                ", views=" + views +
                ", bandwidth=" + bandwidth +
                ", deleteHash='" + deleteHash + '\'' +
                ", name='" + name + '\'' +
                ", section='" + section + '\'' +
                ", link='" + link + '\'' +
                ", gifv='" + gifv + '\'' +
                ", mp4='" + mp4 + '\'' +
                ", webm='" + webm + '\'' +
                ", looping=" + looping +
                ", favorite=" + favorite +
                ", nsfw=" + nsfw +
                ", vote='" + vote + '\'' +
                '}';
    }
}
