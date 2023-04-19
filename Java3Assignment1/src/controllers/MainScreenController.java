package controllers;
import ModelAndStages.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class MainScreenController {
    @FXML
    private Button btnLogout;
    @FXML
    private TextField txtUsd;
    @FXML
    private TextField txtNis;
    @FXML
    private Button btnConvert;

    @FXML
    public void signOut(ActionEvent actionEvent) throws IOException {
        ViewManager.openLoginPage();
        ViewManager.closeMainPage();
    }

    @FXML
    public void convertValues(ActionEvent actionEvent) {
        if (txtNis.getText().isBlank()){
            double usd = Double.parseDouble(txtUsd.getText());
            double nis = usd * 3.60;
            txtNis.setText(String.valueOf(nis));
            txtUsd.setText("");
        } else if (txtUsd.getText().isBlank()) {
            double nis = Double.parseDouble(txtNis.getText());
            double usd = nis / 3.60;
            txtUsd.setText(String.valueOf(usd));
            txtNis.setText("");
        }
    }
}
