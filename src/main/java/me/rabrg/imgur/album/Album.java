package me.rabrg.imgur.album;

import com.google.gson.annotations.SerializedName;
import me.rabrg.imgur.image.Image;

import java.util.List;

public final class Album {

    private String id;
    private String title;
    private String description;
    private long datetime;
    private String cover;
    @SerializedName("cover_width")
    private int coverWidth;
    @SerializedName("cover_height")
    private int coverHeight;
    @SerializedName("account_url")
    private String accountUrl;
    @SerializedName("account_id")
    private int accountId;
    private String privacy;
    private String layout;
    private int views;
    private String link;
    private int ups;
    private int downs;
    private int points;
    private int score;
    @SerializedName("is_album")
    private boolean isAlbum;
    private String vote;
    private boolean favorite;
    private boolean nsfw;
    @SerializedName("comment_count")
    private int commentCount;
    // TODO: remember to add getter and toString for commentPreview
    // @SerializedName("comment_preview")
    // private List<Comment> commentPreview;
    private String topic;
    @SerializedName("imagesCount")
    private int imagesCount;
    private List<Image> images;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public long getDatetime() {
        return datetime;
    }

    public String getCover() {
        return cover;
    }

    public int getCoverWidth() {
        return coverWidth;
    }

    public int getCoverHeight() {
        return coverHeight;
    }

    public String getAccountUrl() {
        return accountUrl;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getPrivacy() {
        return privacy;
    }

    public String getLayout() {
        return layout;
    }

    public int getViews() {
        return views;
    }

    public String getLink() {
        return link;
    }

    public int getUps() {
        return ups;
    }

    public int getDowns() {
        return downs;
    }

    public int getPoints() {
        return points;
    }

    public int getScore() {
        return score;
    }

    public boolean isAlbum() {
        return isAlbum;
    }

    public String getVote() {
        return vote;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public boolean isNsfw() {
        return nsfw;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public String getTopic() {
        return topic;
    }

    public int getImagesCount() {
        return imagesCount;
    }

    public List<Image> getImages() {
        return images;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", datetime=" + datetime +
                ", cover='" + cover + '\'' +
                ", coverWidth=" + coverWidth +
                ", coverHeight=" + coverHeight +
                ", accountUrl='" + accountUrl + '\'' +
                ", accountId=" + accountId +
                ", privacy='" + privacy + '\'' +
                ", layout='" + layout + '\'' +
                ", views=" + views +
                ", link='" + link + '\'' +
                ", ups=" + ups +
                ", downs=" + downs +
                ", points=" + points +
                ", score=" + score +
                ", isAlbum=" + isAlbum +
                ", vote='" + vote + '\'' +
                ", favorite=" + favorite +
                ", nsfw=" + nsfw +
                ", commentCount=" + commentCount +
                ", topic='" + topic + '\'' +
                ", imagesCount=" + imagesCount +
                ", images=" + images +
                '}';
    }
}
