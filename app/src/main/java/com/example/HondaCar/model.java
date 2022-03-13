package com.example.HondaCar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class model extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);

        ImageView Icon = findViewById(R.id.back);
        Icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(model.this, home.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Button jazz= findViewById(R.id.jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(model.this, jazz.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Button newamaze= findViewById(R.id.newamaze);
        newamaze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(model.this, newamaze.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Button wrv= findViewById(R.id.wrv);
        wrv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(model.this, wrv.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Button city= findViewById(R.id.city);
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(model.this, city.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Button newcity= findViewById(R.id.newcity);
        newcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(model.this, newcity.class);
                startActivity(intentLoadNewActivity);
            }
        });


    }
}