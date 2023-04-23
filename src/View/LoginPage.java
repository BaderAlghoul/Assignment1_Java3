/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Bader M
 */
public class LoginPage extends Stage{
    
   private Label userLabel , passwordLabel ;
   private TextField tfUsername;
   private PasswordField pfPassword;
   private Button btnLogin ;
   private ImageView imageView ;
    
    public LoginPage(){
    userLabel = new Label("UserName");
    passwordLabel = new Label("Password");
    btnLogin = new Button("Login");
    btnLogin.setOnAction(e->{
    try{
        ViewManager.openDashboard();
        ViewManager.closeLoginPage();
    }catch(IOException ex){
        Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE , null , ex);
    }
    });
    imageView = new ImageView("/Image/img.png");
    
        VBox vBox = new VBox(10,imageView , userLabel , tfUsername ,  passwordLabel, pfPassword
                , btnLogin);
        
        
        Scene scene = new Scene(vBox , 350 , 600);
        scene.getStylesheets().add("/css/style.css");
        this.setTitle("Login");
        this.setScene(scene);
        this.show();
    }
    
}
