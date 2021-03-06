package com.ggproject.gustavo.ggram.model;

/**
 * Created by Gustavo on 4/8/2017.
 */

public class Picture {

    private String picture;
    private String userName;
    private String time;
    private String likeNumber = "0 lies";

    public Picture(String picture, String userName, String time, String likeNumber) {
        this.picture = picture;
        this.userName = userName;
        this.time = time;
        this.likeNumber = likeNumber;
    }

    public String getPicture() {
        return picture;
    }

    public String getUserName() {
        return userName;
    }

    public String getTime() {
        return time;
    }

    public String getLikeNumber() {
        return likeNumber;
    }
}
