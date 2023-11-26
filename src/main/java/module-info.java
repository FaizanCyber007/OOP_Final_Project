module com.example.scrapmanagmentsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scrapmanagmentsystem to javafx.fxml;
    exports com.example.scrapmanagmentsystem;
}