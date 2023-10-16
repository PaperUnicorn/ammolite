package com.paperunicorn.ammolite.controller;

import javafx.event.ActionEvent;

import java.io.IOException;

public interface MultiSceneApplication {
    public void loadScene(ActionEvent actionEvent, String sceneName) throws IOException;
}
