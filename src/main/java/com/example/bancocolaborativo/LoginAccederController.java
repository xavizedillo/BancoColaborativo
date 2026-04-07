package com.example.bancocolaborativo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginAccederController {

    @FXML
    private void depositar(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("Depositar.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
    }
    @FXML
    private void retirar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Retirar.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    private void consultar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Consultar.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
