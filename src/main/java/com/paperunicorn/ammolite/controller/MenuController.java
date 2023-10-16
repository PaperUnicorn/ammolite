package com.paperunicorn.ammolite.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class MenuController {

    @FXML
    private MenuItem exitButton;

    @FXML
    protected void onExit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
