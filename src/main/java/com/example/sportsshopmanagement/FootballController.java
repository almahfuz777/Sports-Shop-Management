package com.example.sportsshopmanagement;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FootballController {
    private Stage stage ;
    private Scene scene ;
    private Parent root ;

    @FXML
    void BALL1(ActionEvent event)throws IOException {

        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"2022 WORLDCUP BALL"+"= 500" ;
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+500 ;

    }

    @FXML
    void BALL2(ActionEvent event)throws IOException {
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"2018 WORLDCUP BALL"+"= 500" ;
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+500 ;

    }

    @FXML
    void BALL3(ActionEvent event) throws IOException{
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"2014 WORLDCUP BALL"+"= 500" ;
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+500 ;

    }

    @FXML
    void GoBackToProductMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/ProductsMenu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

}