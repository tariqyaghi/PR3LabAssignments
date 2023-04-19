package controllers;

import ModelAndStages.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class LoginController {
    @FXML
    private ImageView imgView;
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnLogin;
    @FXML
    private Label lblStatus;

    @FXML
    public void loginToSystem(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equalsIgnoreCase("user")&&txtPassword.getText().equals("userpass")){
            ViewManager.openMainPage();
            lblStatus.setText("Login Successful.");
            ViewManager.closeLoginPage();
        } else {
            lblStatus.setText("Username or Password Incorrect.");
        }
    }
}
