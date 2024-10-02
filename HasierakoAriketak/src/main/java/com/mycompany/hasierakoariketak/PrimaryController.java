package com.mycompany.hasierakoariketak;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button hbox;
    @FXML
    private Button primaryButton;

    @FXML
    private void switchToHbox() throws IOException {
        App.setRoot("hbox");
    }
    
    @FXML
    private void switchToGridPane() throws IOException {
        App.setRoot("GridPane");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("VboxEtaHbox");
    }
    
    @FXML
    private void switchToRectangles() throws IOException {
        App.setRoot("rectangle");
    }
    
    @FXML
    private void switchToElement() throws IOException {
        App.setRoot("Element_1");
    }
    
    @FXML
    private void switchToPanel() throws IOException {
        App.setRoot("Panels");
    }

    @FXML
    private void switchToButtonEvent() throws IOException {
        App.setRoot("ButtonEvent");
    }

    @FXML
    private void switchToJokua() throws IOException {
        App.setRoot("Jokua");
    }

    @FXML
    private void switchToBatuketa() throws IOException  {
        App.setRoot("batuketa");
    }

    @FXML
    private void switchToAlert() throws IOException  {
        App.setRoot("alert");
    }
    
}
