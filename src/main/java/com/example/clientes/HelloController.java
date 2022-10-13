package com.example.clientes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label labelNombre;
    @FXML
    private Label labelCodigo;
    @FXML
    private TextField txtNombre;
    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnMas;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btnAncla;
    @FXML
    private TableView tabla;

    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
    }
}