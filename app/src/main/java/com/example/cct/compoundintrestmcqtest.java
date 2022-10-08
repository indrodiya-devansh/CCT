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

public class compoundintrestmcqtest extends AppCompatActivity {
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
        setContentView(R.layout.activity_compoundintrestmcqtest);
        t1=   (TextView) findViewById(R.id.question);

        t1.setText(question1);
        op1 = (RadioButton) findViewById(R.id.op1);
        op2 = (RadioButton) findViewById(R.id.op2);
        op3 = (RadioButton) findViewById(R.id.op3);
        op4 = (RadioButton) findViewById(R.id.op4);
        op1.setText("Rs. 120");
        op2.setText("Rs. 121");
        op3.setText("Rs. 122");
        op4.setText("Rs. 123");

    }
    //compound intrest
    public String question1 = "A bank offers 5% compound interest calculated on half-yearly basis. A customer deposits Rs. 1600 each on 1st January and 1st July of a year. At the end of the year, the amount he would have gained by way of interest is:";
    public String question2 = "The difference between simple and compound interests compounded annually on a certain sum of money for 2 years at 4% per annum is Re. 1. The sum (in Rs.) is:";
    public String question3 = "There is 60% increase in an amount in 6 years at simple interest. What will be the compound interest of Rs. 12,000 after 3 years at the same rate?";
    public String question4 = "What is the difference between the compound interests on Rs. 5000 for 1 years at 4% per annum compounded yearly and half-yearly?";
    public String question5 = "The compound interest on Rs. 30,000 at 7% per annum is Rs. 4347. The period (in years) is:";
    public int res = 0;
    //final MediaPlayer myMediaPlayer = MediaPlayer.create(this,R.raw.jawab);

    public void next(View view) {
        if (op2.isChecked()) {
            //myMediaPlayer.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res += 1;
            t1.setText(question2);
            op1.setText("625");
            op2.setText("630");
            op3.setText("640");
            op4.setText("650");
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
            op1.setText("Rs. 2160");
            op2.setText("Rs. 3120");
            op3.setText("Rs. 3972");
            op4.setText("Rs. 6240");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);}
        else if(op3.isChecked() && res==2){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question4);
            op1.setText("Rs. 2.04");
            op2.setText("Rs. 3.06");
            op3.setText("Rs. 4.80");
            op4.setText("Rs. 8.30");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);

        }

        else if(op1.isChecked() && res==3){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question5);
            op1.setText("2");
            op2.setText("5");
            op3.setText("4");
            op4.setText("3");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);}
        else if(op1.isChecked() &&res==4){
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


