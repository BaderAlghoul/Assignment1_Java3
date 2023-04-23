
package assignment1_java3;

import View.ViewManager;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Bader M
 */
public class Assignment1_Java3 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
 
        ViewManager.openLoginPage();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
