package com.example.cct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class percentage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);
    }

    public void formula(View view) {
        Intent intent = new Intent(this, percentageforumla.class);
        startActivity(intent);
    }

    public void Examples(View view) {
        Intent intent = new Intent(this, percentageexamples.class);
        startActivity(intent);
    }

    public void profitandlossmcqtest(View view) {
        Intent intent = new Intent(this, percentagemcqtest.class);
        startActivity(intent);
    }

    public void calculate(View view) {
        Intent intent = new Intent(this, percentagecalc.class);
        startActivity(intent);
    }
}