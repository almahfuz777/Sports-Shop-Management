package com.example.sportsshopmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class CartController {

    private Stage stage ;
    private Scene scene ;
    private Parent root ;

    @FXML
    private TextField cartItemName;

    @FXML
    void getCartText(MouseEvent event) {

    }

    @FXML
    void goBackToMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Menu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void submitCart(ActionEvent event) {

    }

}