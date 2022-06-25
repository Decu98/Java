package com.calculator;

public class Calculation {

    private static String currentNumber = "";
    private static String savedNumber = "";
    private static String resultNumber = "";
    private static String tempNumber = "";
    private static String operation = "";

    static void resetCal() {
        resultNumber = "";
        savedNumber = "";
        currentNumber = "";
        operation = "";
    }

    static void transferNumber(String input) {
        addNumber(input);
    }

    static void setResult() {
        resultNumber = calculateResult();
        tempNumber = resultNumber;
    }

    static void saveNumber() {
        savedNumber = currentNumber;
        currentNumber = "";
    }

    static void setOperation(String input) {
        operation = input;
    }

    static String getCurrent() {
        return currentNumber;
    }

    static String getSaved() {
        return savedNumber;
    }

    static String getOperation() {
        return operation;
    }

    static String getResult() {
        return resultNumber;
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

    private static String calculateResult() {
        int n1 = Integer.parseInt(savedNumber);
        int n2 = Integer.parseInt(currentNumber);
        int result = Integer.parseInt(currentNumber);
        if (operation == "+") {
            result = n1 + n2;
        } else if (operation == "-") {
            result = n1 - n2;
        } else if (operation == "*") {
            result = n1 + n2;
        } else if (operation == "/") {
            result = n1 / n2;
        }
        return String.valueOf(result);
    }
}
