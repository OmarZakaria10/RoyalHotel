package com.example.login2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.Alert;

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
    private static Stage stg;


    @FXML
    void click(ActionEvent event) throws IOException, SQLException {
        username = usernamefield.getText();
        password = passwordfield.getText();
        DbConnect connectNOW = new DbConnect();
        Connection connectDB = connectNOW.getConnect();
        String verifyLogin = "SELECT count(1) FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        try {

            int counter = 0;
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);
            while (queryResult.next()) {

                if (queryResult.getInt(1) == 1) {
                    System.out.println(username + " just logged \n");
                    HelloApplication m = new HelloApplication();
                    m.changeScene("gui.fxml", 589, 493);
                }
                else {wrong.setText("Wrong username or password");
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Error");
                    alert.setHeaderText("Wrong username or password");
                    alert.showAndWait();
                }
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }

    @FXML
    void close(ActionEvent event) {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }
    public void changeScene(String fxml, int x, int y) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.setScene(new Scene(pane, x, y));
        stg.getScene().setRoot(pane);
    }
}



