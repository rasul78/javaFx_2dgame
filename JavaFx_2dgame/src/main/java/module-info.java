module com.example.javafx_2dgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_2dgame to javafx.fxml;
    exports com.example.javafx_2dgame;
}