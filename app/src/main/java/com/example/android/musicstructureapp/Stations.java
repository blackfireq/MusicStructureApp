package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stations);
        //  Categories page
        TextView categories = (TextView) findViewById(R.id.categories);

        categories.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent categoriesIntent = new Intent(Stations.this, Categories.class);

                startActivity(categoriesIntent);
            }
        });

        //  Playlists page
        TextView playlists = (TextView) findViewById(R.id.playlists);

        playlists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(Stations.this, Playlists.class);

                startActivity(playlistsIntent);
            }
        });

        //  Stations page
        TextView home = (TextView) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Stations.this, MainActivity.class);


                startActivity(homeIntent);
            }
        });

        //  Store page
        TextView store = (TextView) findViewById(R.id.store);

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(Stations.this, Store.class);
                startActivity(storeIntent);
            }
        });
    }
}
