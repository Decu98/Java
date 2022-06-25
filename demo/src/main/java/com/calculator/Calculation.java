package com.calculator;

import java.math.BigDecimal;
import java.math.MathContext;

public class Calculation {

    private static String currentNumber = "";
    private static String savedNumber = "";
    private static String resultNumber = "";
    private static String tempNumber = "";
    private static String operation = "";

    static void addDot() {
        if (currentNumber == "") {
            currentNumber = "0.";
        } else if (currentNumber.contains(".")) {
            currentNumber = currentNumber;
        } else {
            currentNumber = currentNumber + ".";
        }
    }

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
        if (resultNumber != "") {
            savedNumber = tempNumber;
            currentNumber = "";
            resultNumber = "";
        }
        if (savedNumber == "") {
            savedNumber = "0";
        }
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
        double n1 = Double.parseDouble(savedNumber);
        double n2 = Double.parseDouble(currentNumber);
        double result = Double.parseDouble(currentNumber);
        if (operation == "+") {
            result = n1 + n2;
        } else if (operation == "-") {
            result = n1 - n2;
        } else if (operation == "*") {
            result = n1 * n2;
        } else if (operation == "/") {
            result = n1 / n2;
        }
        double roundedRes = Math.round(result * 100.0) / 100.0;
        return String.valueOf(roundedRes);
    }
}
