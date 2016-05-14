package com.ericwickstrom.uglycalculator;

/**
 * Created by beardsmcgee on 5/13/16.
 */
public class Calculator {
    //current operation in queue
    public static int ADDITION = 1;
    public static int SUBTRACTION = 2;
    public static int MULTIPLICATION = 3;
    public static int DIVISION = 4;
    public static int NO_OPERATION = 0;
    public int currentOperation = NO_OPERATION;
    private float total = 0;

    Calculator() {

    }


    public void calculate(float number, int operation) {
        if (currentOperation == NO_OPERATION) {
            total = number;
        } else {
            if (currentOperation == ADDITION) {
                total = total + number;
            } else if (currentOperation == SUBTRACTION) {
                total = total - number;
            } else if (currentOperation == MULTIPLICATION) {
                total = total * number;
            } else if (currentOperation == DIVISION) {
                total = total / number;
            }
        }
        currentOperation = operation;
    }

    public void clear() {
        total = 0;
    }

    public int getCurrentOperation() {
        return currentOperation;
    }

    public String getTotal(){
        return String.valueOf(total);
    }
}
