package com.paperunicorn.ammolite.controller;

import com.paperunicorn.ammolite.AmmoliteApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneController implements MultiSceneApplication {

    private static SceneController INSTANCE;
    public void loadScene(ActionEvent actionEvent, String sceneName) throws IOException {
        System.out.println("loading scene "+sceneName);
        Parent root = FXMLLoader.load(Objects.requireNonNull(AmmoliteApplication.class.getResource(sceneName+".fxml")));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static SceneController getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SceneController();
        }
        return INSTANCE;
    }
}