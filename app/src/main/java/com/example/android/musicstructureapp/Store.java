package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        //  Categories page
        TextView categories = (TextView) findViewById(R.id.categories);

        categories.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent categoriesIntent = new Intent(Store.this, Categories.class);

                startActivity(categoriesIntent);
            }
        });

        //  Playlists page
        TextView playlists = (TextView) findViewById(R.id.playlists);

        playlists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(Store.this, Playlists.class);

                startActivity(playlistsIntent);
            }
        });

        //  Stations page
        TextView stations = (TextView) findViewById(R.id.stations);

        stations.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent stationsIntent = new Intent(Store.this, Stations.class);


                startActivity(stationsIntent);
            }
        });

        //  Store page
        TextView home = (TextView) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Store.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
