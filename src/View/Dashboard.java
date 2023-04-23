/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Bader M
 */
public class Dashboard extends Stage{
    private Scene cuurencyScane ;
    public Dashboard() throws IOException{
   FXMLLoader cuurencyScaneLoader = new FXMLLoader(getClass().getResource("FXML/CurrencyScane.fxml"));
   Parent cuurencyScaneRoot = cuurencyScaneLoader.load();
   cuurencyScane = new Scene(cuurencyScaneRoot);
   
    }
    public void Currencu(){
    this.setScene(cuurencyScane);
    }
    

   

}
