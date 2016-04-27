package com.example.guest.moviefone;


import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Guest on 4/27/16.
 */
public class Movie {
    private String mTitle;
    private String mOverview;
    private String mCast;
    private String mYear;
    private String mImageUrl;
    private double mRating;
    private String mGenre;


    public Movie(String title, String overview, String cast, String imageUrl, String genre, double rating, String year){
       this.mTitle = title;
       this.mOverview = overview;
       this.mCast = cast;
       this.mImageUrl = "http://image.tmdb.org/t/p/w500" + imageUrl;
       this.mGenre = genre;
        this.mRating = rating;
       this.mYear = year;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getYear(){
        return "("+mYear+")";
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
    public String getGenre() {
        return mGenre;
    }
}
