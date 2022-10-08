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

public class calendarmcqtest extends AppCompatActivity {
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
        setContentView(R.layout.activity_calendarmcqtest);
        t1=   (TextView) findViewById(R.id.question);

        t1.setText(question1);
        op1 = (RadioButton) findViewById(R.id.op1);
        op2 = (RadioButton) findViewById(R.id.op2);
        op3 = (RadioButton) findViewById(R.id.op3);
        op4 = (RadioButton) findViewById(R.id.op4);
        op1.setText("sunday");
        op2.setText("saturday");
        op3.setText("friday");
        op4.setText("wednesday");


    }
    public String question1 ="It was Sunday on Jan 1, 2006. What was the day of the week Jan 1, 2010?";
    public String question2 = "What was the day of the week on 28th May, 2006?" ;
    public String question3 = "What was the day of the week on 17th June, 1998?";
    public String question4 = "What will be the day of the week 15th August, 2010?";
    public String  question5 = "Today is Monday. After 61 days, it will be:";
    public int res = 0;
    //final MediaPlayer myMediaPlayer = MediaPlayer.create(this,R.raw.jawab);

    public void next(View view) {
        if (op3.isChecked()) {
            //myMediaPlayer.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res += 1;
            t1.setText(question2);
            op1.setText("tuesday");
            op2.setText("monday");
            op3.setText("saturday");
            op4.setText("sunday");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);
        }


        else if(op4.isChecked() && res==1){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question3);
            op1.setText("sunday");
            op2.setText("monday");
            op3.setText("wednesday");
            op4.setText("saturday");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);}
        else if(op3.isChecked() && res==2){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question4);
            op1.setText("sunday");
            op2.setText("monday");
            op3.setText("tuesday");
            op4.setText("saturday");
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
            op1.setText("sunday");
            op2.setText("saturday");
            op3.setText("wednesday");
            op4.setText("tuesday");
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


