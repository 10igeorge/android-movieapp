package com.example.guest.moviefone;

import com.example.guest.moviefone.models.Movie;

/**
 * Created by Guest on 4/27/16.
 */
public class Constants {
    public static final String MOVIE_DATABASE_KEY = BuildConfig.MOVIE_DATABASE_KEY;

    public static final String MOVIE_DB_BASE_URL = "http://api.themoviedb.org/3/search/movie";
    public static final String MOVIE_INFO_BASE_URL = "http://api.themoviedb.org/3/movie/";

    public static final String MOVIE_DB_GENRE_URL = "http://api.themoviedb.org/3/genre/movie/list";
    public static final String MOVIE_DB_QUERY_PARAMETER = "api_key";
    public static final String MOVIE_TITLE_QUERY = "query";
    public static final int MOVIE_ID = Movie.getId();

}
