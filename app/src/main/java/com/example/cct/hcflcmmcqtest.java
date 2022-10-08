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

public class hcflcmmcqtest extends AppCompatActivity {
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
        setContentView(R.layout.activity_hcflcmmcqtest);
        t1=   (TextView) findViewById(R.id.question);

        t1.setText(question1);
        op1 = (RadioButton) findViewById(R.id.op1);
        op2 = (RadioButton) findViewById(R.id.op2);
        op3 = (RadioButton) findViewById(R.id.op3);
        op4 = (RadioButton) findViewById(R.id.op4);
        op1.setText("4");
        op2.setText("7");
        op3.setText("9");
        op4.setText("13");

    }
    //hcf and lcm intrest
    public String question1 =  "Find the greatest number that will divide 43, 91 and 183 so as to leave the same remainder in each case.";
    public String question2 =  "The H.C.F. of two numbers is 23 and the other two factors of their L.C.M. are 13 and 14. The larger of the two numbers is:";
    public String question3 = "Six bells commence tolling together and toll at intervals of 2, 4, 6, 8 10 and 12 seconds respectively. In 30 minutes, how many times do they toll together ?";
    public String question4 = "Let N be the greatest number that will divide 1305, 4665 and 6905, leaving the same remainder in each case. Then sum of the digits in N is:";
    public String question5 = "The greatest number of four digits which is divisible by 15, 25, 40 and 75 is:";
    public int res = 0;
    //final MediaPlayer myMediaPlayer = MediaPlayer.create(this,R.raw.jawab);

    public void next(View view) {
        if (op1.isChecked()) {
            //myMediaPlayer.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res += 1;
            t1.setText(question2);
            op1.setText("276");
            op2.setText("299");
            op3.setText("322");
            op4.setText("345");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);
        }


        else if(op3.isChecked() && res==1){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question3);
            op1.setText("4");
            op2.setText("10");
            op3.setText("15");
            op4.setText("16");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);}
        else if(op4.isChecked() && res==2){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question4);
            op1.setText("4");
            op2.setText("5");
            op3.setText("6");
            op4.setText("8");
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
            op1.setText("9000");
            op2.setText("9400");
            op3.setText("9600");
            op4.setText("9800");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);}
        else if(op3.isChecked() &&res==4){
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


