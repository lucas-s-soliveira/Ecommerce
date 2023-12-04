package com.example.demo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EComerceController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}