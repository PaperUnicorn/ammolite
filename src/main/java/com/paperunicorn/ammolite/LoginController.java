package com.paperunicorn.ammolite;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private String username;

    @FXML
    private String password;

    @FXML
    protected void onLogin(ActionEvent actionEvent) throws IOException {
        SceneController.getINSTANCE().loadScene(actionEvent, "main");
    }

}
