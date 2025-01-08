module com.vxvitevilcorp.testejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.vxvitevilcorp.testejavafx to javafx.fxml;
    exports com.vxvitevilcorp.testejavafx;
}