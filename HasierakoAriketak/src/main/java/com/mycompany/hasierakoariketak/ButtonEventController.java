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
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author 2AM3-6
 */
public class ButtonEventController implements Initializable {

    @FXML
    private Button buttonHello;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void toBye(ActionEvent event) {
        if(buttonHello.getText().equals("HELLO")){
            buttonHello.setText("BYE");
        } else{
            buttonHello.setText("HELLO");
        }
    }
    
}
