package com.example.recyrcviev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Favourites extends AppCompatActivity {
    public static ArrayList<ArrayList<Good>> favouritesArrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalise);
        listView = findViewById(R.id.ListView);

        AdapterGood goodAdapter = new AdapterGood(Favourites.this, R.layout.list_item, LocalDB.arrayList);
        listView.setAdapter(goodAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}