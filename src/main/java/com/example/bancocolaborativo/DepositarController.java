package com.example.bancocolaborativo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DepositarController {

    @FXML
    private TextField txtDeposito;

    @FXML
    private Label lblMensaje;

    @FXML
    private void depositarDinero() {
        try {
            double cantidad = Double.parseDouble(txtDeposito.getText());

            if (cantidad > 0) {
                CuentaBancaria.saldo += cantidad;
                lblMensaje.setText("Depósito exitoso. Nuevo saldo: $" + CuentaBancaria.saldo);
                txtDeposito.clear();
            } else {
                lblMensaje.setText("Ingresa una cantidad válida.");
            }

        } catch (NumberFormatException e) {
            lblMensaje.setText("Solo puedes ingresar números.");
        }
    }

    @FXML
    private void regresarInicio(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginAcceder.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}