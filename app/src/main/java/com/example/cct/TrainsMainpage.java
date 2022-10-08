package com.example.cct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TrainsMainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trains_mainpage);
    }

    public void formula(View view) {
        Intent intent = new Intent(this, trainformula.class);
        startActivity(intent);
    }

    public void Examples(View view) {
        Intent intent = new Intent(this, trainexamples.class);
        startActivity(intent);
    }

    public void profitandlossmcqtest(View view) {
        Intent intent = new Intent(this, trainmcqtest.class);
        startActivity(intent);
    }
}