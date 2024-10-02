module com.mycompany.hasierakoariketak {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.hasierakoariketak to javafx.fxml;
    exports com.mycompany.hasierakoariketak;
}
