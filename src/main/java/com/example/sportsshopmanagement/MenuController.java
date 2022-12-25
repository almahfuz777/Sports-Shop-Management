package com.example.sportsshopmanagement;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    private Stage stage ;
    private Scene scene ;
    private Parent root ;
    @FXML
    void MenuExit(ActionEvent event) throws IOException {
        Platform.exit();
        System.exit(0);
    }
    @FXML
   public void UserCart(ActionEvent event)throws IOException {

       root = FXMLLoader.load(getClass().getResource("/Cart.fxml"));
       stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();

   }

    @FXML
   public void ProductsBtn(ActionEvent event) throws IOException{
        //kaj baki
       root = FXMLLoader.load(getClass().getResource("/ProductsMenu.fxml"));
       stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
   }

    @FXML
   public void ShopAdsBtn(ActionEvent event) throws IOException{
        //kaj baki
       root = FXMLLoader.load(getClass().getResource("/SignUp.fxml"));
       stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
   }

    @FXML
   public void UserInfoBtn(ActionEvent event) throws IOException{
        //kaj baki
       root = FXMLLoader.load(getClass().getResource("/UserInfo.fxml"));
       stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();

   }
}
