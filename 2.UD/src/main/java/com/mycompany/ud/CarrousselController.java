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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author 2AM3-6
 */
public class CarrousselController implements Initializable {
    
    String[] imagenes ={"imagenes/ajolote.png","imagenes/aye_aye.png","imagenes/cangrejoYeti.png",
          "imagenes/chauliodus.png","imagenes/diablilloespinoso.png","imagenes/dragonMarino.png",
          "imagenes/gusanoCalamar.png","imagenes/mixini.png","imagenes/petaurodelazucar.png",
          "imagenes/pezmancha.png","imagenes/pezsapopeludo.png","imagenes/picozapato.png",
          "imagenes/pulpoDumbo.png","imagenes/ratonLemur.png","imagenes/solenodonte.png","imagenes/tardigrado.png"};
    
    
    
    Image imagen = new Image(imagenes[0]);
    
    
    int posizioa = 0;
    
    @FXML
    private Button derechaBtn;
    @FXML
    private Button izquierdaBtn;
    @FXML
    private ImageView irudia;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        irudia.setImage(imagen);
    }    

    @FXML
    private void imagenDerecha(ActionEvent event) {
        if(posizioa < imagenes.length - 1){
             Image imagenDerecha = new Image(imagenes[posizioa + 1]);
             irudia.setImage(imagenDerecha);
             posizioa++;
        } else if(posizioa == imagenes.length - 1) {
             Image imagenDerecha = new Image(imagenes[0]);
             irudia.setImage(imagenDerecha);
             posizioa = 0;
        }
         
    }
    @FXML
    private void imagenIzquierda(ActionEvent event) {
        if(posizioa > 0){
            Image imagenIzquierda = new Image(imagenes[posizioa - 1]);
            irudia.setImage(imagenIzquierda);
            posizioa--;
        }   else if(posizioa == 0) {
            Image imagenIzquierda = new Image(imagenes[imagenes.length - 1]);
            irudia.setImage(imagenIzquierda);
            posizioa = imagenes.length - 1;
        }
                
    }
    
}
