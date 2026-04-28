package app;
import controller.Display;
import controller.sbcontrols;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
        // Point to the fxml file in the view folder
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/officialdisplay.fxml"));
        Parent root = loader.load();

        Display dis = loader.getController(); //conneted to display.java


        Scene scene = new Scene(root);
        primaryStage.setTitle("Scoreboard Display");
        primaryStage.setScene(scene);
        primaryStage.show();


        FXMLLoader controlLoader = new FXMLLoader(getClass().getResource("/view/controls.fxml"));
        Parent controlRoot = controlLoader.load();

        sbcontrols controller = controlLoader.getController();
        controller.setDisplay(dis);

        Stage controlStage = new Stage(); 
        controlStage.setTitle("Scoreboard Controls");
        controlStage.setScene(new Scene(controlRoot));
        controlStage.show();

      
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public static void main(String[] args) {
        launch(args);
    }
}