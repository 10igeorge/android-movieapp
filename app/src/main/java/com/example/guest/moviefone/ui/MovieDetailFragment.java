package com.example.guest.moviefone.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guest.moviefone.R;
import com.example.guest.moviefone.models.Movie;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MovieDetailFragment extends Fragment {
    @Bind(R.id.movieImageView) ImageView mImageLabel;
    @Bind(R.id.movieEditText) TextView mTitleLabel;
    @Bind(R.id.genreTextView) TextView mGenresLabel;
    @Bind(R.id.ratingTextView) TextView mRatingsLabel;
    @Bind(R.id.overviewTextView) TextView mOverviewLabel;
    @Bind(R.id.directorTextView) TextView mDirectorLabel;
    @Bind(R.id.castTextView) TextView mCastLabel;
    @Bind(R.id.saveMovieButton) TextView mSaveMovieButton;

    private Movie mMovie;

    public MovieDetailFragment newInstance(Movie movie) {
        MovieDetailFragment movieDetailFragment = new MovieDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("movie", Parcels.wrap(movie));
        movieDetailFragment.setArguments(args);
        return movieDetailFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMovie = Parcels.unwrap(getArguments().getParcelable("movie"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_detail, container, false);
        ButterKnife.bind(this, view);

        Picasso.with(view.getContext()).load(mMovie.getImageUrl()).into(mImageLabel);
        mTitleLabel.setText(mMovie.getTitle());
        mGenresLabel.setText(mMovie.getGenre());
        mRatingsLabel.setText(Double.toString(mMovie.getRating()) + "/10");
//        mDirectorLabel.setText(mMovie.getDirector());
//        mCastLabel.setText(mMovie.getCast());
        return inflater.inflate(R.layout.fragment_movie_detail, container, false);
    }

}
