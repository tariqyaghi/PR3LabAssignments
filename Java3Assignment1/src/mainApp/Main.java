package mainApp;

import ModelAndStages.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewManager.openLoginPage();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
