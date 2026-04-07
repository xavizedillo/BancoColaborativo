module com.example.bancocolaborativo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.base;
    requires javafx.graphics;

    opens com.example.bancocolaborativo to javafx.fxml;
    exports com.example.bancocolaborativo;
}