module com.paperunicorn.ammolite {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;

    opens com.paperunicorn.ammolite to javafx.fxml;
    exports com.paperunicorn.ammolite;
    exports com.paperunicorn.ammolite.controller;
    opens com.paperunicorn.ammolite.controller to javafx.fxml;
}