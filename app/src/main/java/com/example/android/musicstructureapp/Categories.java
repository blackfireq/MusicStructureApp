package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        //  Home page
        TextView home = (TextView) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent categoriesIntent = new Intent(Categories.this, MainActivity.class);

                startActivity(categoriesIntent);
            }
        });

        //  Playlists page
        TextView playlists = (TextView) findViewById(R.id.playlists);

        playlists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(Categories.this, Playlists.class);

                startActivity(playlistsIntent);
            }
        });

        //  Stations page
        TextView stations = (TextView) findViewById(R.id.stations);

        stations.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent stationsIntent = new Intent(Categories.this, Stations.class);


                startActivity(stationsIntent);
            }
        });

        //  Store page
        TextView store = (TextView) findViewById(R.id.store);

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(Categories.this, Store.class);
                startActivity(storeIntent);
            }
        });
    }
}
