package com.example.cct;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.cct.calculationmethod;

public class profitlosscalc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profitlosscalc);
    }

    public void calculate(View view) {
        EditText buy  = (EditText) findViewById(R.id.buy);
        EditText sell  = (EditText) findViewById(R.id.sell);
        double buy1 = Double.parseDouble(buy.getText().toString());
        double sell1 = Double.parseDouble(sell.getText().toString());
        calculationmethod check = new calculationmethod();
        String pro=check.profitandloss(buy1,sell1);

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
