module com.example.clientes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clientes to javafx.fxml;
    exports com.example.clientes;
}