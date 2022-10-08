package com.example.cct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Reasoning extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reasoning);


    }



    public void Age(View view) {
        Intent i=new Intent(Reasoning.this,
                AgesMainpage.class);
        //Intent is used to switch from one activity to another.

        startActivity(i);
    }

    public void Trains(View view) {
        Intent i=new Intent(Reasoning.this,
                TrainsMainpage.class);
        //Intent is used to switch from one activity to another.

        startActivity(i);
    }

    public void Clock(View view) {
        Intent i=new Intent(Reasoning.this,
                ClockMainpage.class);
        //Intent is used to switch from one activity to another.

        startActivity(i);
    }

    public void Calender(View view) {
        Intent i=new Intent(Reasoning.this,
                CalendarMainpage.class);
        //Intent is used to switch from one activity to another.

        startActivity(i);
    }
}
