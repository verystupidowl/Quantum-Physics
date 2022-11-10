module com.tgc.rezerford {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tgc.rezerford to javafx.fxml;
    exports com.tgc.rezerford;
    exports com.tgc.rezerford.controller;
    opens com.tgc.rezerford.controller to javafx.fxml;
}