package com.example.sportsshopmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        DataFile dataFile = new DataFile();
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("/Login.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("ByteMeDirtyBites");
            stage.setScene(scene);
            stage.show();
        }
    }
