package ModelAndStages;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainScreenStage extends Stage {
    public MainScreenStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/MainScreen.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        this.setTitle("Currency Conversion");
        this.setScene(scene);
    }
}
