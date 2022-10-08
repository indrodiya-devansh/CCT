package com.example.cct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void register(View view) {
        Intent intent = new Intent(this, registration.class);
        startActivity(intent);
    }

    public void login(View view) {
        EditText mobile = (EditText) findViewById(R.id.mobile);
        EditText password = (EditText) findViewById(R.id.password);
        String mob = mobile.getText().toString();
        String pass = password.getText().toString();
        if (mob.equals("uttam")&&pass.equals("7777")){
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
            Toast.makeText(this, "Login Successfull", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Login Unsuccessfull", Toast.LENGTH_LONG).show();
        }

    }
}