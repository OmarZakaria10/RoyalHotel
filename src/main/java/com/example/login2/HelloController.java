package com.example.login2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.Connection;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloController {
    public static String username;
    public static String password;
    @FXML
    private Button but1;

    @FXML
    private Button cancel;

    @FXML
    private PasswordField passwordfield;

    @FXML
    public TextField usernamefield;

    @FXML
    private Label wrong;


    @FXML
    void click(ActionEvent event) throws IOException, SQLException {
        username=usernamefield.getText();
        password=passwordfield.getText();
        /*if (username.getText().toString().equals("Omar") && password.getText().toString().equals("root")){

     wrong.setText("Hello again "+username.getText()+"...!");
            m.changeScene("gui.fxml");
        }
        else wrong.setText("Wrong username or password");*/
        //System.out.println(usernamefield.getText());
        DbConnect connectNOW =new DbConnect();
        Connection connectDB =connectNOW.getConnect();
        System.out.println("sucess");
        String verifyLogin= "SELECT count(1) FROM users WHERE username = '" +username +"' AND password = '" + password +"'";
        try {
            int counter=0;
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);
            while (queryResult.next()){

                if (queryResult.getInt(1)==1){
                    HelloApplication m = new HelloApplication();
                    m.changeScene("gui.fxml",589,493);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void close(ActionEvent event) {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }}



