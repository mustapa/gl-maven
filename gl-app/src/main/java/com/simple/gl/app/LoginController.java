/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.gl.app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author mustapa
 */
public class LoginController implements Initializable {
    
    @FXML private TextField userName;
    @FXML private PasswordField password;
    @FXML private Label labelError;

    @FXML
    public void signInButton(ActionEvent event) {
        String message = "Sign In proses ! - " + 
                        "Username : " + userName.getText() + " - " +
                        "Password : " + password.getText();
        labelError.setText(message);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
