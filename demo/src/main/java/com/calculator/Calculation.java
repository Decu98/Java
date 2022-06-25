package com.calculator;

public class Calculation {

    private static String currentNumber;

    static void transferNumber(String input) {
        addNumber(input);
    }

    private static void addNumber(String input) {
        if (currentNumber != null) {
            currentNumber = currentNumber + input;
            String s = currentNumber;
            System.out.println(s);
        } else {
            currentNumber = input;
            String s = currentNumber;
            System.out.println(s);
        }
    }
}
