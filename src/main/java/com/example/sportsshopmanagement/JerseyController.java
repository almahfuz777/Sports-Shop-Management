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

public class JerseyController {
    private Stage stage ;
    private Scene scene ;
    private Parent root ;
    @FXML
    public void JerseyGoBack(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/ProductsMenu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void buyArgJersey(ActionEvent event) throws IOException {

        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"Argentina Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }

    @FXML
    public void buyBDjersey(ActionEvent event) throws IOException {
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"BD Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }

    @FXML
    public void buyBarcaJersey(ActionEvent event) throws IOException {
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"Barcelona Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }

    @FXML
    public void buyIndJersey(ActionEvent event)throws IOException  {
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"Ind Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }

    @FXML
    public void buyPakJersey(ActionEvent event)throws IOException  {
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"Pakistan Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }

    @FXML
    public void buyPsgJersey(ActionEvent event)throws IOException {
        FileWriter fw = new FileWriter(DataFile.tempFIle,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+"PSJ Jersey "+"= 1000";
        b.write(addData);
        b.close();
        fw.close();
        DataFile.CutomerBill = DataFile.CutomerBill+1000 ;

    }
}
