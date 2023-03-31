module com.example.apexlater {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.apexlater to javafx.fxml;
    exports com.example.apexlater;
}