package ModelAndStages;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginStage extends Stage {
    public LoginStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/loginScreen.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        this.setTitle("Login");
        this.setScene(scene);
    }
}
