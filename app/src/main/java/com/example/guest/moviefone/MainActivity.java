package com.example.guest.moviefone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.movieEditText) EditText mMovieTitle;
    @Bind(R.id.searchTitleButton) Button mSearchTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearchTitle.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.searchTitleButton:
                String title = mMovieTitle.getText().toString();
                Intent i = new Intent(MainActivity.this, MovieActivity.class);
                i.putExtra("title", title);
                startActivity(i);
                break;
            default:
                break;
        }

    }
}
