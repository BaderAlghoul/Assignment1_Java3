/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import View.ViewManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Bader M
 */
public class CurrencyScaneController implements Initializable {

    @FXML
    private TextField tfUsd;
    @FXML
    private TextField tfNis;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handelButLogout(ActionEvent event) {
        ViewManager.openLoginPage();
        ViewManager.closeDashboard();
    }

    @FXML
    private void handelButConvert(ActionEvent event) {
        String usdString = tfUsd.getText();
        String nisString = tfNis.getText();
        double usd = Double.parseDouble(usdString);
        double nis = Double.parseDouble(nisString);


        
        if( nisString==null){
            double result = usd*3.20;
            tfNis.setText(result+"");
        }
        else if (usdString==null ){
             double result = nis/3.20;
            tfUsd.setText(result+"");
        }


    }
    
}
