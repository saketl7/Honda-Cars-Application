package com.example.HondaCar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    ImageButton myIBgps, myIBmodel, myIBemi, myIBtest, myIBbuy, myIBnear, myIBchat, myIBgate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView Icon = findViewById(R.id.menu);
        Icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(home.this, menu.class);
                startActivity(intentLoadNewActivity);
            }
        });


        //Image Button for GPS Speed Tracker
        myIBgps = (ImageButton) findViewById(R.id.ibgps);
        myIBgps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(home.this, gps.class);
                startActivity(intentLoadNewActivity);
            }
        });

        //Image Button for Models
        myIBmodel = (ImageButton) findViewById(R.id.ibmodel);
        myIBmodel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(home.this, model.class);
                startActivity(intentLoadNewActivity);
            }
        });

        //Image Button for EMI Calculator
        myIBemi = (ImageButton) findViewById(R.id.ibemi);
        myIBemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(home.this, emi.class);
                startActivity(intentLoadNewActivity);
            }
        });

        //Image Button for Test Drive
        myIBtest = (ImageButton) findViewById(R.id.ibtest);
        myIBtest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(home.this, test.class);
                startActivity(intentLoadNewActivity);
            }
        });

        //Image Button for Buy/Book
        myIBbuy = (ImageButton) findViewById(R.id.ibbuy);

        myIBbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(home.this, buy.class);
                startActivity(intentLoadNewActivity);
            }
        });

        //Image Button for Nearby Service stations
        myIBnear = (ImageButton) findViewById(R.id.ibnear);

        myIBnear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(home.this, near.class);
                startActivity(intentLoadNewActivity);
            }
        });

        //Image Button for Chatbot
        myIBchat = (ImageButton) findViewById(R.id.ibchat);
        myIBchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(home.this, chat.class);
                startActivity(intentLoadNewActivity);
            }
        });

        //Image Button for Gatepass
        myIBgate = (ImageButton) findViewById(R.id.ibgate);
        myIBgate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(home.this, gate.class);
                startActivity(intentLoadNewActivity);
            }
        });




    }


}