package com.example.bancocolaborativo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ConsultarController {

    @FXML
    private Label lblSaldo;

    @FXML
    public void initialize() {
        lblSaldo.setText("Tu saldo es: $" + CuentaBancaria.saldo);
    }

    @FXML
    private void regresarInicio(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginAcceder.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}