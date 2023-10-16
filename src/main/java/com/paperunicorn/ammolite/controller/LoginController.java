package com.paperunicorn.ammolite.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class LoginController extends SceneController {
    @FXML
    private String username;

    @FXML
    private String password;

    @FXML
    protected void onLogin(ActionEvent actionEvent) throws IOException {
       loadScene(actionEvent, "main");
    }

}
