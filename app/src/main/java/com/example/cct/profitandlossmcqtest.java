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

public class profitandlossmcqtest extends AppCompatActivity {
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
        setContentView(R.layout.activity_profitandlossmcqtest);
        t1=   (TextView) findViewById(R.id.question);

        t1.setText(question1);
        op1 = (RadioButton) findViewById(R.id.op1);
        op2 = (RadioButton) findViewById(R.id.op2);
        op3 = (RadioButton) findViewById(R.id.op3);
        op4 = (RadioButton) findViewById(R.id.op4);
        op1.setText("1900");
        op2.setText("2200");
        op3.setText("2470");
        op4.setText("1700");


    }
    public String question1 = "Two successive discounts of 40% and 20%, respectively, on the marked price of an article are equal to single discount of Rs 988. The marked price (in Rs) of the article is:";
    public String question2 = "A fruit seller buys lemons at 2 for a rupee and sells then at 5 for three rupees. His gain percent is";
    public String question3 ="A sells a car to B at 10% loss. If B sells it for Rs. 54000 and gains 20%, the cost price of the car for A was";
    public String question4 = "Ramesh sold a statue for a price 25% higher than the original price of the statue. He had however bought the statue at 20% discount on the original price. With the profit of Rs. 2025, find the original price of the statue.";
    public String question5 = "If selling price of 40 articles is equal to cost price of 50 articles, the loss or gain percent is";
    public int res = 0;
    //final MediaPlayer myMediaPlayer = MediaPlayer.create(this,R.raw.jawab);

    public void next(View view) {
        if (op1.isChecked()) {
            //myMediaPlayer.start();
            Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
            res += 1;
            t1.setText(question2);
            op1.setText("10%");
            op2.setText("15%");
            op3.setText("20%");
            op4.setText(" 25%");
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
                op1.setText(" Rs. 25000");
                op2.setText(" Rs. 50000");
                op3.setText("Rs. 37500");
                op4.setText("Rs. 60000");
                op1.setChecked(false);
                op2.setChecked(false);
                op3.setChecked(false);
                op4.setChecked(false);}
                else if(op2.isChecked() && res==2){
                    //music.start();
                    Toast.makeText(this, "correct answer", Toast.LENGTH_LONG).show();
                    res +=1;
                    t1.setText(question4);
                    op1.setText("Rs. 6000");
                    op2.setText("Rs. 7500");
                    op3.setText("Rs. 3500");
                    op4.setText("Rs. 4500");
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
                    op1.setText("25% loss");
                    op2.setText("20% loss");
                    op3.setText("25% gain");
                    op4.setText("20% gain");
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


