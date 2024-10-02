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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 2AM3-6
 */
public class BatuketaController implements Initializable {

    @FXML
    private TextField zenbaki1;
    @FXML
    private TextField zenbaki2;
    @FXML
    private Button buttonEmaitza;
    @FXML
    private TextField emaitza;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void emaitzaErakutsi(ActionEvent event) {
        int zenbaki3 = 0;
        
        zenbaki3 = Integer.parseInt(zenbaki1.getText()) + Integer.parseInt(zenbaki2.getText());
        
        emaitza.setText(" "+ zenbaki3 +" "); 
    }
    
}
