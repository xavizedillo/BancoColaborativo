package com.example.bancocolaborativo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField txtUser;

    @FXML
    private TextField txtPass;
    @FXML
    private Label lblError;

    @FXML
    private void onLogin(ActionEvent event) throws IOException {
        if(txtUser.getText().equals("Jeringas") && txtPass.getText().equals("tacogalleta123")){
            Parent root = FXMLLoader.load(getClass().getResource("LoginAcceder.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }else {
            lblError.setVisible(true);
        }
    }













}
