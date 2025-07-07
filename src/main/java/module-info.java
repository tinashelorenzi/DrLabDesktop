module com.drlab.drlabdesktop {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires atlantafx.base;

    opens com.drlab.drlabdesktop to javafx.fxml;
    exports com.drlab.drlabdesktop;
}