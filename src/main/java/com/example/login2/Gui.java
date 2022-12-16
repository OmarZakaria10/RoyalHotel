package com.example.login2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Gui extends HelloController
{
    @FXML
    private Button checkin;

    @FXML
    private Button checkout;

    @FXML
    private Button rooms;
    @FXML
    public Label welcome;
    @FXML
    void checkin_click(ActionEvent event) throws IOException {
        HelloApplication z = new HelloApplication();
        z.changeScene("check in.fxml",800,640);

    }





    @javafx.fxml.FXML
    public void initialize() throws Exception {
        welcome.setText("Welcome Back "+username);
    }



}
