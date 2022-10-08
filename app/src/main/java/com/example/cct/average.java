package com.example.cct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class average extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average);
    }

    public void formula(View view) {
        Intent intent = new Intent(this, averageformula.class);
        startActivity(intent);

    }

    public void Examples(View view) {
        Intent intent = new Intent(this, averageexamples.class);
        startActivity(intent);
    }

    public void profitandlossmcqtest(View view) {
        Intent intent = new Intent(this, averagemcqtest.class);
        startActivity(intent);
    }

    public void calculate(View view) {
        Intent intent = new Intent(this, averagecalc.class);
        startActivity(intent);
    }
}