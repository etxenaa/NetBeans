/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.ud;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author 2AM3-6
 */
public class Gridpane_2Controller implements Initializable {

    @FXML
    private Button verImgBtn;
    @FXML
    private Button ocultarBtn;
    @FXML
    private GridPane gridpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void verImagenes(ActionEvent event) {
        gridpane.setVisible(true);
    }

    @FXML
    private void ocultarImagenes(ActionEvent event) {
        gridpane.setVisible(false);
             
    }
    
}
