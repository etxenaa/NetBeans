module com.mycompany.ud {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.ud to javafx.fxml;
    exports com.mycompany.ud;
}
