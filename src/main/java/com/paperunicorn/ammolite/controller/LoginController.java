package com.paperunicorn.ammolite.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController extends SceneController {
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    protected void onLogin(ActionEvent actionEvent) throws IOException {
       loadScene(actionEvent, "main");
    }

    @FXML
    protected void onReset(ActionEvent actionEvent) throws IOException {
        username.setText("");
        password.setText("");
    }

}
