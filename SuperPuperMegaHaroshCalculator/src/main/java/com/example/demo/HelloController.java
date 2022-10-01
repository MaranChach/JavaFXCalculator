package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    private int result = 0;
    private mathActions lastAction;
    @FXML
    private Label welcomeText;
    @FXML
    private TextField textField;

    @FXML
    private void initialize(){
        textField.setEditable(false);
    }
    @FXML
    protected void on1ButtonClick() {
        AddDigit(1);
    }
    @FXML
    protected void on2ButtonClick() {
        AddDigit(2);
    }
    @FXML
    protected void on3ButtonClick() {
        AddDigit(3);
    }
    @FXML
    protected void on4ButtonClick() {
        AddDigit(4);
    }
    @FXML
    protected void on5ButtonClick() {
        AddDigit(5);
    }
    @FXML
    protected void on6ButtonClick() {
        AddDigit(6);
    }
    @FXML
    protected void on7ButtonClick() {
        AddDigit(7);
    }
    @FXML
    protected void on8ButtonClick() {
        AddDigit(8);
    }
    @FXML
    protected void on9ButtonClick() {
        AddDigit(9);
    }
    @FXML
    protected void on0ButtonClick() {
        AddDigit(0);
    }
    @FXML
    protected void onMultiplButtonClick() {
        if (textField.getText() != "") {
            result = Integer.parseInt(textField.getText());
            textField.setText("");
            lastAction = mathActions.Multiplication;
        }
    }
    @FXML
    protected void onPlusButtonClick() {
        if(textField.getText() != ""){
            result += Integer.parseInt(textField.getText());
            textField.setText("");
            //textField.setText(String.valueOf(result));
            lastAction = mathActions.Plus;
        }
    }
    @FXML
    protected void onMinusButtonClick() {
        if(textField.getText() != "") {
            result = Integer.parseInt(textField.getText());
            textField.setText("");
            lastAction = mathActions.Minus;
        }
    }
    @FXML
    protected void onDivideButtonClick() {
        if(textField.getText() != "") {
            result = Integer.parseInt(textField.getText());
            textField.setText("");
            lastAction = mathActions.Divide;
        }
    }
    @FXML
    protected void onDotButtonClick() {
    }
    @FXML
    protected void onClearButtonClick() {
        textField.setText("");
    }
    @FXML
    private void onResultButtonClick() {
        switch (lastAction){
            case Plus :
                result += Integer.parseInt(textField.getText());
                textField.setText(String.valueOf(result));
                result = 0;
                break;
            case Minus :
                result -= Integer.parseInt(textField.getText());
                textField.setText(String.valueOf(result));
                result = 0;
                break;
            case Multiplication :
                if (result == 0)
                    result = 1;
                result *= Integer.parseInt(textField.getText());
                textField.setText(String.valueOf(result));
                result = 0;
                break;
            case Divide :
                result /= Integer.parseInt(textField.getText());
                textField.setText(String.valueOf(result));
                result = 0;
                break;

        }
    }

    private void AddDigit(int digit){
        if (textField.getText() != "" & digit != 0)
            textField.setText(textField.getText() + digit);
    }



}