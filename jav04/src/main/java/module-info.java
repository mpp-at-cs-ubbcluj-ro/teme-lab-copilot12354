module ro.mpp2025.jav04 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ro.mpp2025.jav04 to javafx.fxml;
    exports ro.mpp2025.jav04;
}