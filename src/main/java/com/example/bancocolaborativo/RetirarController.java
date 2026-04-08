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

public class RetirarController {

    @FXML
    private TextField txtRetiro;

    @FXML
    private Label lblMensaje;

    @FXML
    private void retirarDinero() {
        try {
            double cantidad = Double.parseDouble(txtRetiro.getText());

            if (cantidad <= 0) {
                lblMensaje.setText("Ingresa una cantidad válida.");
            } else if (cantidad > CuentaBancaria.saldo) {
                lblMensaje.setText("Saldo insuficiente.");
            } else {
                CuentaBancaria.saldo -= cantidad;
                lblMensaje.setText("Retiro exitoso. Nuevo saldo: $" + CuentaBancaria.saldo);
                txtRetiro.clear();
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