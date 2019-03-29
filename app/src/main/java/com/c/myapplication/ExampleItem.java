package com.c.myapplication;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;
    private int mVues;
    private int mComments;

    public ExampleItem(String imageUrl, String creator, int likes, int nb_vues, int comments) {
        mImageUrl = imageUrl;
        mCreator = creator;
        mLikes = likes;
        mVues = nb_vues;
        mComments = comments;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

    public int getLikeCount() {
        return mLikes;
    }

    public int getVues(){ return mVues;}

    public int getComments(){ return mComments;}

}
