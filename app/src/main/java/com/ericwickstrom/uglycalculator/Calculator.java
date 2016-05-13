package com.ericwickstrom.uglycalculator;

/**
 * Created by beardsmcgee on 5/13/16.
 */
public class Calculator {
    private float total;

    Calculator() {
        total = 0;
    }

    public void add(float number){
        total = total + number;
    }

    public void subtract(float number){
        total = total - number;
    }

    public void multiply(float number){
        total = total * number;
    }

    public void divide(float number){
        total = total / number;
    }

    public String getTotal(){
        return String.valueOf(total);
    }
}
