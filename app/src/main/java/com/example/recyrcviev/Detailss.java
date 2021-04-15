package com.example.recyrcviev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Detailss extends AppCompatActivity {
    ImageView goodImage;
    TextView heard;
    TextView description;
    TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailss);
        goodImage = findViewById(R.id.imageViewdetails);
        heard = findViewById( R.id.heardDetail);
        description = findViewById(R.id.descriptionDetails);
        time = findViewById(R.id.timeDetail);

        Intent intent = getIntent();
        Good good = LocalDB.DataBeath(Integer.parseInt(intent.getStringExtra("post")));
        Log.i("infoLog", "intent");

        goodImage.setImageResource(good.getImageResource());
        heard.setText(good.getHeader());
        description.setText(good.getDescription());
        time.setText(good.getTime());



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}