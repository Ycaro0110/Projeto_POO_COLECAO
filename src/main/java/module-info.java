module start {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens start to javafx.fxml;
    exports start;

    opens model to javafx.fxml;
    exports model;
    opens controller to javafx.fxml;
    exports controller;


}