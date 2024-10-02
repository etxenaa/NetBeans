/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.hasierakoariketak;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author 2AM3-6
 */
public class AlertController implements Initializable {

    @FXML
    private Button alert1;
    @FXML
    private Button alert2;
    @FXML
    private Button alert3;
    @FXML
    private Button alert4;
    @FXML
    private Button alert5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void alertak(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setAlertType(Alert.AlertType.CONFIRMATION);
        alert.show();
    }
    
    @FXML
    private void switchToAlert(ActionEvent event) {
        //alertak(event);
    }

    @FXML
    private void switchToAlert2(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setAlertType(Alert.AlertType.ERROR);
        alert.show();
    }

    @FXML
    private void switchToAlert3(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setAlertType(Alert.AlertType.INFORMATION);
        alert.show();
    }

    @FXML
    private void switchToAlert4(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setAlertType(Alert.AlertType.WARNING);
        alert.show();
    }

    @FXML
    private void switchToAlert5(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.NONE);  
        alert.setAlertType(Alert.AlertType.NONE);
        alert.show();
    }
    
}
