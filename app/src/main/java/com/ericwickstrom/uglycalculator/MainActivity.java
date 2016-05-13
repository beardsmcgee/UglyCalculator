package com.ericwickstrom.uglycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String total = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPress(View view){

    }

    public void buttonPress1(View view){
        total = total + "1";
        updateDisplay();
    }

    public void buttonPress2(View view){
        total = total + "2";
        updateDisplay();
    }

    public void buttonPress3(View view){
        total = total + "3";
        updateDisplay();
    }

    public void buttonPress4(View view){
        total = total + "4";
        updateDisplay();
    }

    public void buttonPress5(View view){
        total = total + "5";
        updateDisplay();
    }

    public void buttonPress6(View view){
        total = total + "6";
        updateDisplay();
    }

    public void buttonPress7(View view){
        total = total + "7";
        updateDisplay();
    }

    public void buttonPress8(View view){
        total = total + "8";
        updateDisplay();
    }


    public void buttonPress9(View view){
        total = total + "9";
        updateDisplay();
    }

    public void buttonPress0(View view){
        total = total + "0";
        updateDisplay();
    }

    private void updateDisplay(){
        TextView display = (TextView) findViewById(R.id.display);
        display.setText(total);
    }
}
