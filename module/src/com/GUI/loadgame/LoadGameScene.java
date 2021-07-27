package com.GUI.loadgame;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoadGameScene {

    private Scene loadGameScene = null;
    private Scene loadGameWaitScene = null;
    private Parent root = null;

    public void buildLoadGameScene(Stage stage) {
        try {
            root = FXMLLoader.load(this.getClass().getResource("LoadGameScreen.fxml"));
            loadGameScene = new Scene(root, 800, 600);
            stage.setScene(loadGameScene);
            stage.show();
        }  catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void buildLoadGameWaitScene(Stage stage) {
        try {
            root = FXMLLoader.load(this.getClass().getResource("LoadGameWaitScreen.fxml"));
            loadGameWaitScene = new Scene(root, 800, 600);
            stage.setScene(loadGameWaitScene);
            stage.show();
        }  catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void buildLoadGameRestartScene(Stage stage) {
        try {
            root = FXMLLoader.load(this.getClass().getResource("LoadGameRestartScreen.fxml"));
            loadGameWaitScene = new Scene(root, 800, 600);
            stage.setScene(loadGameWaitScene);
            stage.show();
        }  catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void buildLoseResetLoadGameScene(Stage stage) {
        try {
            root = FXMLLoader.load(this.getClass().getResource("LoseResetLoadGameScreen.fxml"));
            loadGameWaitScene = new Scene(root, 800, 600);
            stage.setScene(loadGameWaitScene);
            stage.show();
        }  catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
