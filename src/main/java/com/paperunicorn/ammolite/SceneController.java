package com.paperunicorn.ammolite;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    private static SceneController INSTANCE;

    public void loadScene(ActionEvent actionEvent, String sceneName) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(AmmoliteApplication.class.getResource(sceneName+".fxml")));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static SceneController getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new SceneController();
        }
        return INSTANCE;
    }
}