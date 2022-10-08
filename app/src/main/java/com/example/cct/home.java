package com.example.cct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void maths(View view) {
        openNewActivity();
    }
    public void openNewActivity() {
        Intent intent = new Intent(this, maths.class);
        startActivity(intent);
    }

    public void Reasoning(View view) {
        Intent intent = new Intent(this, Reasoning.class);
        startActivity(intent);
    }
}