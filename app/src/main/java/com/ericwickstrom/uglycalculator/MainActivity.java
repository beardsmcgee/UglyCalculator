package com.ericwickstrom.uglycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //calculator object handles all of the logic (+, -, /, x, =) operations
    private Calculator calculator = new Calculator();

    //this string is what is displayed to the user
    private String total = "";

    private boolean firstNumericButtonPress = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //event listener for button 1
    public void buttonPress1(View view){
        firstNumericButtonPress();
        total = total + "1";
        updateDisplay();
    }

    //event listener for button 2
    public void buttonPress2(View view){
        firstNumericButtonPress();
        total = total + "2";
        updateDisplay();
    }

    //event listener for button 3
    public void buttonPress3(View view){
        firstNumericButtonPress();
        total = total + "3";
        updateDisplay();
    }

    //event listener for button 4
    public void buttonPress4(View view){
        firstNumericButtonPress();
        total = total + "4";
        updateDisplay();
    }

    //event listener for button 5
    public void buttonPress5(View view){
        firstNumericButtonPress();
        total = total + "5";
        updateDisplay();
    }

    //event listener for button 6
    public void buttonPress6(View view){
        firstNumericButtonPress();
        total = total + "6";
        updateDisplay();
    }

    //event listener for button 7
    public void buttonPress7(View view){
        firstNumericButtonPress();
        total = total + "7";
        updateDisplay();
    }

    //event listener for button 8
    public void buttonPress8(View view){
        firstNumericButtonPress();
        total = total + "8";
        updateDisplay();
    }

    //event listener for button 9
    public void buttonPress9(View view){
        firstNumericButtonPress();
        total = total + "9";
        updateDisplay();
    }

    //event listener for button 0
    public void buttonPress0(View view){
        firstNumericButtonPress();
        total = total + "0";
        updateDisplay();
    }

    //event listener for button decimal
    public void buttonPressDecimal(View view){
        if (!total.contains(".")) {
            total = total + ".";
        }
    }

    //event listener for button addition
    public void buttonPressAdd(View view) {
        calculator.calculate(Float.valueOf(total), Calculator.ADDITION);
        firstNumericButtonPress = true;
        updateDisplay();
    }

    //event listener for button subtract
    public void buttonPressSubtract(View view){
        calculator.calculate(Float.valueOf(total), Calculator.SUBTRACTION);
        firstNumericButtonPress = true;
        updateDisplay();
    }

    //event listener for button multiply
    public void buttonPressMultiply(View view) {
        calculator.calculate(Float.valueOf(total), Calculator.MULTIPLICATION);
        firstNumericButtonPress = true;
        updateDisplay();
    }

    public void buttonPressDivision(View view) {
        calculator.calculate(Float.valueOf(total), Calculator.DIVISION);
        firstNumericButtonPress = true;
        updateDisplay();
    }

    //event listener for button clear
    public void buttonPressClear(View view){
        total = "";
        calculator.clear();
        updateDisplay();
    }

    //event listener for button equal
    public void buttonPressEqual(View view){

    }

    private void firstNumericButtonPress() {
        if (firstNumericButtonPress) {
            total = "";
            firstNumericButtonPress = false;
        }
    }

    //updates display when pressing number buttons to construct a number
    private void updateDisplay(){
        TextView display = (TextView) findViewById(R.id.display);
        if (firstNumericButtonPress) {
            display.setText(calculator.getTotal());
        } else {
            display.setText(total);
        }
    }
}
