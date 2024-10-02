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
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author 2AM3-6
 */
public class JokuaController implements Initializable {

    @FXML
    private Button buttonUp;
    @FXML
    private Button buttonRight;
    @FXML
    private Button buttonLeft;
    @FXML
    private Button buttonDown;
    @FXML
    private Rectangle circulo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void toUp(ActionEvent event) {
        int x = GridPane.getRowIndex(circulo);
        
        if(x > 0 && x <= 4){
            GridPane.setRowIndex(circulo, (x - 1));
        } else {
            GridPane.setRowIndex(circulo, x);
        }
    }

    @FXML
    private void toRight(ActionEvent event) {
        int x = GridPane.getColumnIndex(circulo);
        
        if(x >= 0 && x < 4){
            GridPane.setColumnIndex(circulo, (x + 1));
        }else {
            GridPane.setColumnIndex(circulo, x);
        }
    }

    @FXML
    private void toLeft(ActionEvent event) {
        int x = GridPane.getColumnIndex(circulo);
        
        if(x > 0 && x <= 4){
            GridPane.setColumnIndex(circulo, (x - 1));
        }else {
            GridPane.setColumnIndex(circulo, x);
        }
    }

    @FXML
    private void toDown(ActionEvent event) {
        int x = GridPane.getRowIndex(circulo);
        
        if(x >= 0 && x < 4){
            GridPane.setRowIndex(circulo, (x + 1));
        } else{
            GridPane.setRowIndex(circulo, x);
        }
    }
    
}
