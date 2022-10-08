package com.example.cct;

import android.app.AlertDialog;
import android.content.DialogInterface;

public class calculationmethod {
    double profit,loss;
    String result ="" ;
    double percentage;
    String preult="";
    double average;
    String areult="";
    double simpleintrest;
    String sreult="";
    double compoundintrest;
    String creult="";

    public String profitandloss(double buy, double sell){
        if(buy<sell){
            this.profit = sell-buy;
            this.result = "profit = ";
            return result+profit;
        }
        else{
            this.loss = buy-sell;
            this.result = "loss = ";
            return result+loss;
        }
    }
    public String percentage(double number, double per){
        this.percentage= (per/100)*number;
        this.preult = "answer:- ";
        return  preult+percentage;
    }
    public String average(double number1,double number2,double number3,double number4,double number5){
        this.average= (number1+number2+number3+number4+number5)/5;
        this.areult = "answer:- ";
        return  areult+average;
    }
    public String simpleintrest(double balnce,double percent,double time){
        this.simpleintrest= (balnce*percent*time)/100;
        this.areult = "answer:- ";
        return  areult+simpleintrest;
    }
    public String compoundintrest(double balnce,double percent,double time) {
        this.compoundintrest = (balnce * percent * time) / 100;
        this.creult = "answer:- ";
        return creult + compoundintrest;
    }
}