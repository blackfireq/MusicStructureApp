package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Categories page
        TextView categories = (TextView) findViewById(R.id.categories);

        categories.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent categoriesIntent = new Intent(MainActivity.this, Categories.class);

                startActivity(categoriesIntent);
            }
        });

        //  Playlists page
        TextView playlists = (TextView) findViewById(R.id.playlists);

        playlists.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, Playlists.class);

                startActivity(playlistsIntent);
            }
        });

        //  Stations page
        TextView stations = (TextView) findViewById(R.id.stations);

        stations.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent stationsIntent = new Intent(MainActivity.this, Stations.class);


                startActivity(stationsIntent);
            }
        });

        //  Store page
        TextView store = (TextView) findViewById(R.id.store);

        store.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(MainActivity.this, Store.class);
                startActivity(storeIntent);
            }
        });
    }
}
