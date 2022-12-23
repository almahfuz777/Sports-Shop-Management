package com.example.sportsshopmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    private Stage stage ;
    private Scene scene ;
    private Parent root ;

    public void switchToSignUp(ActionEvent event) throws IOException {
         root = FXMLLoader.load(getClass().getResource("/SignUp.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToSignIn(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/Login.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
