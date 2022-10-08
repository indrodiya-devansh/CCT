package com.example.cct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class simpleintrest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleintrest);
    }

    public void formula(View view) {
        Intent intent = new Intent(this, simpleintrestformula.class);
        startActivity(intent);
    }

    public void Examples(View view) {
        Intent intent = new Intent(this, simpleintrestexamples.class);
        startActivity(intent);
    }

    public void profitandlossmcqtest(View view) {
        Intent intent = new Intent(this, simpleintrestmcqtest.class);
        startActivity(intent);
    }

    public void calculate(View view) {
        Intent intent = new Intent(this, simpleintrestcalc.class);
        startActivity(intent);
    }
}