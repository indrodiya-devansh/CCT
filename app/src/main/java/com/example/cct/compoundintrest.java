package com.example.cct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class compoundintrest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compoundintrest);
    }

    public void formula(View view) {
        Intent intent = new Intent(this, compoundintrstformula.class);
        startActivity(intent);
    }

    public void Examples(View view) {
        Intent intent = new Intent(this, compoundintrestexamples.class);
        startActivity(intent);
    }

    public void profitandlossmcqtest(View view) {
        Intent intent = new Intent(this, compoundintrestmcqtest.class);
        startActivity(intent);
    }

    public void calculate(View view) {
        Intent intent = new Intent(this, compoundintrestcalc.class);
        startActivity(intent);
    }
}