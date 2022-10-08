
        package com.example.cct;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.cct.R;
import com.example.cct.calculationmethod;

public class compoundintrestcalc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compoundintrestcalc);
    }

    public void calculate(View view) {
        EditText buy  = (EditText) findViewById(R.id.btn1);
        EditText sell  = (EditText) findViewById(R.id.btn2);
        EditText sell2  = (EditText) findViewById(R.id.btn3);
        double buy1 = Double.parseDouble(buy.getText().toString());
        double sell1 = Double.parseDouble(sell.getText().toString());
        double btn3 = Double.parseDouble(sell2.getText().toString());
        calculationmethod check = new calculationmethod();
        String pro=check.compoundintrest(buy1,sell1,btn3);

        new AlertDialog.Builder(this)
                .setTitle("Result")
                .setMessage("Your "+ pro)

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
}
