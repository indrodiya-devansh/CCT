package com.example.cct;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class simpleintrestmcqtest extends AppCompatActivity {
    public TextView t1 ;
    public RadioButton op1;
    public RadioButton op2;
    public RadioButton op3;
    public RadioButton op4;
    public TextView result;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleintrestmcqtest);
        t1=   (TextView) findViewById(R.id.question);

        t1.setText(question1);
        op1 = (RadioButton) findViewById(R.id.op1);
        op2 = (RadioButton) findViewById(R.id.op2);
        op3 = (RadioButton) findViewById(R.id.op3);
        op4 = (RadioButton) findViewById(R.id.op4);
        op1.setText("Rs. 650");
        op2.setText("Rs. 690");
        op3.setText("Rs. 698");
        op4.setText("Rs. 700");

    }
    //simple intrest
    public String question1 = "A sum of money at simple interest amounts to Rs. 815 in 3 years and to Rs. 854 in 4 years. The sum is:";
    public String question2 = "Mr. Thomas invested an amount of Rs. 13,900 divided in two different schemes A and B at the simple interest rate of 14% p.a. and 11% p.a. respectively. If the total amount of simple interest earned in 2 years be Rs. 3508, what was the amount invested in Scheme B?";
    public String question3 ="A sum fetched a total simple interest of Rs. 4016.25 at the rate of 9 p.c.p.a. in 5 years. What is the sum?";
    public String question4 = "How much time will it take for an amount of Rs. 450 to yield Rs. 81 as interest at 4.5% per annum of simple interest?";
    public String question5 = "Reena took a loan of Rs. 1200 with simple interest for as many years as the rate of interest. If she paid Rs. 432 as interest at the end of the loan period, what was the rate of interest?";
    public int res = 0;
    //final MediaPlayer myMediaPlayer = MediaPlayer.create(this,R.raw.jawab);

    public void next(View view) {
        if (op3.isChecked()) {
            //myMediaPlayer.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res += 1;
            t1.setText(question2);
            op1.setText("Rs. 6400");
            op2.setText("Rs. 6500");
            op3.setText("Rs. 7200");
            op4.setText("Rs. 7500");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);
        }


        else if(op1.isChecked() && res==1){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question3);
            op1.setText("Rs. 4462.50");
            op2.setText("Rs. 8032.50");
            op3.setText("Rs. 8900");
            op4.setText("Rs. 8925");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);}
        else if(op4.isChecked() && res==2){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question4);
            op1.setText("3.5 years");
            op2.setText("4 years");
            op3.setText("4.5 years");
            op4.setText("5 years");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);

        }

        else if(op2.isChecked() && res==3){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question5);
            op1.setText("3.6");
            op2.setText("6");
            op3.setText("18");
            op4.setText("none of these");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);}
        else if(op2.isChecked() &&res==4){
            res +=1;
            new AlertDialog.Builder(this)
                    .setTitle("Result")
                    .setMessage("Your Result = "+ res)

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Continue with delete operation
                        }
                    })

                    // A null listener allows the button to dismiss the dialog and take no further action.
                    .setIcon(android.R.drawable.ic_lock_idle_alarm)
                    .show();

        }
        else{
            Toast.makeText(this, "not correct answer", Toast.LENGTH_LONG).show();
        }



    }

}


