package com.example.apexlater;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ApexLaterController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}