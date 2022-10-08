package com.example.cct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class maths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
    }

    public void profitandloss(View view) {

            Intent intent = new Intent(this, profitandloss.class);
            startActivity(intent);

    }

    public void percentage(View view) {
        Intent intent = new Intent(this, percentage.class);
        startActivity(intent);

    }

    public void average(View view) {
        Intent intent = new Intent(this, average.class);
        startActivity(intent);
    }

    public void simpleintrest(View view) {
        Intent intent = new Intent(this, simpleintrest.class);
        startActivity(intent);
    }

    public void compoundintrest(View view) {
        Intent intent = new Intent(this, compoundintrest.class);
        startActivity(intent);
    }

    public void hcfandlcm(View view) {
        Intent intent = new Intent(this, hcflcm.class);
        startActivity(intent);
    }
}