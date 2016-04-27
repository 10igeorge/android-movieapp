package com.example.guest.moviefone;

import java.util.ArrayList;

/**
 * Created by Guest on 4/27/16.
 */
public class Movie {
    private String mTitle;
    private String mOverview;
    private String mCast;
    private String mImageUrl;
    private double mRating;
    private ArrayList<Integer> mGenre;


    public Movie(String title, String overview, String cast, String imageUrl, ArrayList<Integer> genre){
       this.mTitle = title;
       this.mOverview = overview;
       this.mCast = cast;
       this.mImageUrl = imageUrl;
       this.mGenre = genre;
    }

    public String getTitle() {
        return mTitle;
    }
    public String getOverview() {
        return mOverview;
    }
    public String getCast() {
        return mCast;
    }
    public String getImageUrl() {
        return mImageUrl;
    }
    public double getRating() {
        return mRating;
    }
    public ArrayList<Integer> getGenres() {
        return mGenre;
    }
}
