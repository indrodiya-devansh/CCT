package com.example.cct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profitandloss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profitandloss);
    }

    public void formula(View view) {
        Intent intent = new Intent(this, profitandlossformula.class);
        startActivity(intent);
    }

    public void profitandlossmcqtest(View view) {
        Intent intent = new Intent(this, profitandlossmcqtest.class);
        startActivity(intent);
    }

    public void calculate(View view) {
        Intent intent = new Intent(profitandloss.this,profitlosscalc.class);
        startActivity(intent);
    }

    public void Examples(View view) {
        Intent intent = new Intent(profitandloss.this,profitandlossexamples.class);
        startActivity(intent);
    }
}