package com.example.login2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CheckIn {

    @FXML
    private Button Back;

    @FXML
    private TextField CVCFld;

    @FXML
    private TextField IDFld;

    @FXML
    private MenuItem VIP;

    @FXML
    private TextField addressFld;

    @FXML
    private TextField cardnumberFld;

    @FXML
    private TextField cityFld;

    @FXML
    private Button confirm;

    @FXML
    private MenuItem economy;

    @FXML
    private TextField emailFld;

    @FXML
    private TextField holderFld;

    @FXML
    private MenuButton menu;

    @FXML
    private TextField nameFld;

    @FXML
    private TextField nationalityFld;

    @FXML
    private MenuItem normal;

    @FXML
    private TextField numofDaysFld;

    @FXML
    private TextField phoneFld;

    @FXML
    void Back_click(ActionEvent event) throws IOException {
        HelloApplication x = new HelloApplication();
        x.changeScene("gui.fxml",550,400);

    }

    @FXML
    void confirm_click(ActionEvent event) throws ClassNotFoundException {
        String name= nameFld.getText();
        String nationality= nationalityFld.getText();
        String ID= IDFld.getText();
        String address= addressFld.getText();
        String city= cityFld.getText();
        String phone= phoneFld.getText();
        String email= emailFld.getText();
        //int phoneNum= Integer.parseInt(phone);
        //int idNum=Integer.parseInt(ID);
        System.out.println(ID);
        System.out.println(phone);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            DbConnect connectNOW =new DbConnect();
            Connection con =connectNOW.getConnect();
            PreparedStatement st;
            st= con.prepareStatement("insert into Customer");

        }catch(Exception e){

        }
    }

    public void search_click(ActionEvent actionEvent) {

    }
}
