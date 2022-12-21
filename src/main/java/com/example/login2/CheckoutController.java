package com.example.login2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CheckoutController {
    public static String roomnumber;
    @FXML
    private TextField roomID_textfield;
    @FXML
    private Button checkoutbutton;
    public void checkoutbutton_click(ActionEvent event) throws IOException{
        roomnumber=roomID_textfield.getText();
        HelloApplication m=new HelloApplication();
        m.changeScene("receipt.fxml",600,400);
    }

}
