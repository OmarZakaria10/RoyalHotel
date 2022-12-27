package com.example.login2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ForAdmins {
    @FXML
    private Button Back;

    @FXML
    private Button Insert;

    @FXML
    private Button delete;

    @FXML
    private TextField password1;

    @FXML
    private TextField privilege1;

    @FXML
    private TextField username1;

    @FXML
    private Label welcome;

    public static String username_;
    public static String password_;
    public static String privilege_;
    int id;

    @FXML
    void delete_click(ActionEvent event) {
        try {
            users y=new users();
            y.setUsername(username1.getText());
            y.setPassword(password1.getText());
            y.setPrivilege(privilege1.getText());
            DbConnect connectNOW = new DbConnect();
            Connection connectDB = connectNOW.getConnect();
            try {

                PreparedStatement st;
                st = connectDB.prepareStatement("SELECT ID FROM users WHERE username =? AND password =?");
                st.setString(1, y.getUsername());
                st.setString(2, y.getPassword());
                ResultSet queryResult = st.executeQuery();
                while (queryResult.next() == true) {

                    id = queryResult.getInt("ID");
                    System.out.println(id);
                }
            } catch (Exception e) {
            }


            DbConnect connectNOW3 = new DbConnect();
            Connection con3 = connectNOW3.getConnect();
            PreparedStatement st3;
            st3 = con3.prepareStatement("DELETE FROM users WHERE `users`.`ID` = ?");
            st3.setInt(1, id);

            int status = st3.executeUpdate();
            HelloApplication x = new HelloApplication();
            x.changeScene("gui.fxml", 589, 493);
            ;
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    @FXML
    void Back_click(ActionEvent event) throws IOException {
        HelloApplication x = new HelloApplication();
        x.changeScene("gui.fxml", 589, 493);
        ;

    }

    @FXML
    void insert_click(ActionEvent event) {
        try {
            users y=new users();
            y.setUsername(username1.getText());
            y.setPassword(password1.getText());
            y.setPrivilege(privilege1.getText());
            DbConnect connectNOW3 = new DbConnect();
            Connection con3 = connectNOW3.getConnect();
            PreparedStatement st3;
            st3 = con3.prepareStatement("INSERT INTO `users`(`username`, `password`, `privilege`) VALUES (?,?,?)");
            st3.setString(1, y.getUsername());
            st3.setString(2, y.getPassword());
            st3.setString(3, y.getPrivilege());
            int status = st3.executeUpdate();
            HelloApplication x = new HelloApplication();
            x.changeScene("gui.fxml", 589, 493);
            ;
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}



