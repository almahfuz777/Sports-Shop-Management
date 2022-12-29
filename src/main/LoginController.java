package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class LoginController {
    @FXML
    private Label errorTextField;
    @FXML
    private PasswordField LogUserPass;
    @FXML
    private Button logInBtn;
    @FXML
    private TextField logUserName;
    @FXML
    private Button SignBtn;
    @FXML
    private TextField signUserName;
    @FXML
    private PasswordField signUserPass;
    @FXML
    private Label errorLabel;

    private Stage stage ;
    private Scene scene ;
    private Parent root ;

    public void switchToSignUp(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Sign Up");
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToSignIn(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("LOGIN PAGE");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void logInButtons(ActionEvent event) throws IOException {
        if(logUserName.getText()==""){
            errorTextField.setText("User name field can not be empty.");
        } 
        else if (LogUserPass.getText()=="") {
            errorTextField.setText("password field can not be empty.");
        } 
        else if (!new Admin().Login(logUserName.getText() ,LogUserPass.getText())) {
            errorTextField.setText("Username and password didn't match");

        }
        else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Success");
            alert.setContentText("Successfully Log In");
            Optional<ButtonType> result = alert.showAndWait();

            DataFile.CustomerName = logUserName.getText() ;
            DataFile.CustomerPass = LogUserPass.getText() ;

            //after login
            root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Menu");
            stage.setScene(scene);
            stage.show();
        }

    }
    @FXML
   public void signUpButton(ActionEvent event) throws IOException {
        Admin admin = new Admin();
        if(signUserName.getText()==""){
            errorLabel.setText("Email field is Empty");

        } 
        else if (signUserPass.getText()=="") {
            errorLabel.setText("Password field is Empty");
        }
        else if (admin.Registration(signUserName.getText() ,signUserPass.getText())) {
            DataFile.CutomerNO++;
            root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("LOGIN PAGE");
            stage.setScene(scene);
            stage.show();

        }

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Success");
        alert.setContentText("Successfully Sign Up !");
        Optional<ButtonType> result = alert.showAndWait();
    }
    @FXML
    public void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Landing.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Sports Shop");
        stage.setScene(scene);
        stage.show();

    }

}
