/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;

/**
 *
 * @author Bader M
 */
public class ViewManager {
    public static LoginPage loginPage ;
    public static Dashboard dashboard ;
    public ViewManager(){
  }
    public static void openLoginPage(){
    if (loginPage == null){
    loginPage=new LoginPage();
    loginPage.show();
    }else{
    loginPage.show();
    }
    }
    
        public static void closeLoginPage(){
        if(loginPage != null)
            loginPage.close();
    }
    
    public static void openDashboard() throws IOException{
        if (dashboard == null) {
            dashboard = new Dashboard();
            dashboard.show();
        } else {
            dashboard.show();
        }
        
    }
    public static void closeDashboard(){
        if(dashboard != null)
            dashboard.close();
    }
    
}
