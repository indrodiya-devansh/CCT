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

public class trainmcqtest extends AppCompatActivity {
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
        setContentView(R.layout.activity_trainmcqtest);
        t1=   (TextView) findViewById(R.id.question);

        t1.setText(question1);
        op1 = (RadioButton) findViewById(R.id.op1);
        op2 = (RadioButton) findViewById(R.id.op2);
        op3 = (RadioButton) findViewById(R.id.op3);
        op4 = (RadioButton) findViewById(R.id.op4);
        op1.setText("120 metres");
        op2.setText("160 metres");
        op3.setText("100metres");
        op4.setText("150 metres");


    }
    public String question1 ="A train running at the speed of 60 km/hr crosses a pole in 9 seconds. What is the length of the train?";
    public String question2 = "A train 125 m long passes a man, running at 5 km/hr in the same direction in which the train is going, in 10 seconds. The speed of the train is:";
    public String question3 = "The length of the bridge, which a train 130 metres long and travelling at 45 km/hr can cross in 30 seconds, is:";
    public String question4 = "Two trains running in opposite directions cross a man standing on the platform in 27 seconds and 17 seconds respectively and they cross each other in 23 seconds. The ratio of their speeds is:";
    public String  question5 = "A train passes a station platform in 36 seconds and a man standing on the platform in 20 seconds. If the speed of the train is 54 km/hr, what is the length of the platform?";
    public int res = 0;
    //final MediaPlayer myMediaPlayer = MediaPlayer.create(this,R.raw.jawab);

    public void next(View view) {
        if (op4.isChecked()) {
            //myMediaPlayer.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res += 1;
            t1.setText(question2);
            op1.setText("45 km/hr");
            op2.setText("50 km/hr");
            op3.setText("60 km/hr");
            op4.setText("70 km/hr");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);
        }


        else if(op2.isChecked() && res==1){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question3);
            op1.setText("245 m");
            op2.setText("234 m");
            op3.setText("434 m");
            op4.setText("224 m");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);}
        else if(op1.isChecked() && res==2){
            //music.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res +=1;
            t1.setText(question4);
            op1.setText("1 : 4");
            op2.setText("3 : 2");
            op3.setText("4 : 5");
            op4.setText("1 : 5");
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
            op1.setText("150 m");
            op2.setText("100 m");
            op3.setText("200 m");
            op4.setText("240 m");
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);}
        else if(op4.isChecked() &&res==4){
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


