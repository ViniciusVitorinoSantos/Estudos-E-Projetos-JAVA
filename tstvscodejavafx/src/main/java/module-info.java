module com.evilcorp.vxvit {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.evilcorp.vxvit to javafx.fxml;
    exports com.evilcorp.vxvit;
}
