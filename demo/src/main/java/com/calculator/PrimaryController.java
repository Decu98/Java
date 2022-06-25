package com.calculator;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void oneHandeler() throws IOException {
        mainHandeler("1");
    }

    @FXML
    private void twoHandeler() throws IOException {
        mainHandeler("2");
    }

    @FXML
    private void threeHandeler() throws IOException {
        mainHandeler("3");
    }

    @FXML
    private void fourHandeler() throws IOException {
        mainHandeler("4");
    }

    @FXML
    private void fiveHandeler() throws IOException {
        mainHandeler("5");
    }

    @FXML
    private void sixHandeler() throws IOException {
        mainHandeler("6");
    }

    @FXML
    private void sevenHandeler() throws IOException {
        mainHandeler("7");
    }

    @FXML
    private void eightHandeler() throws IOException {
        mainHandeler("8");
    }

    @FXML
    private void nineHandeler() throws IOException {
        mainHandeler("9");
    }

    @FXML
    private void zeroHandeler() throws IOException {
        mainHandeler("0");
    }

    private void mainHandeler(String number) throws IOException {
        Calculation.transferNumber(number);
    }

}
