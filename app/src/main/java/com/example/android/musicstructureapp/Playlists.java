package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
        //  Categories page
        TextView categories = (TextView) findViewById(R.id.categories);

        categories.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent categoriesIntent = new Intent(Playlists.this, Categories.class);

                startActivity(categoriesIntent);
            }
        });

        //  Home page
        TextView home = (TextView) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Playlists.this, MainActivity.class);

                startActivity(homeIntent);
            }
        });

        //  Stations page
        TextView stations = (TextView) findViewById(R.id.stations);

        stations.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent stationsIntent = new Intent(Playlists.this, Stations.class);


                startActivity(stationsIntent);
            }
        });

        //  Store page
        TextView store = (TextView) findViewById(R.id.store);

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(Playlists.this, Store.class);
                startActivity(storeIntent);
            }
        });
    }
}
