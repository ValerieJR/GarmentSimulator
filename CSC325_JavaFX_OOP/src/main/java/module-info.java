module org.example.csc325_javafx_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc325_javafx_oop to javafx.fxml;
    exports org.example.csc325_javafx_oop;
}