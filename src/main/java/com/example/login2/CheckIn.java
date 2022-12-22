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
import java.sql.ResultSet;

public class CheckIn {
    @FXML
    private TextField roomIDFld;

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
    String room_Type;
    int roomnumber;


    @FXML
    void Back_click(ActionEvent event) throws IOException {
        HelloApplication x = new HelloApplication();
        x.changeScene("gui.fxml", 589, 493);
        ;

    }

    @FXML
    void VIP_choose(ActionEvent event) {
        room_Type = "VIP";
        System.out.println(room_Type);
    }

    @FXML
    void economy_choose(ActionEvent event) {
        room_Type = "Economy";
        System.out.println(room_Type);
    }

    @FXML
    void normal_choose(ActionEvent event) {
        room_Type = "Normal";
        System.out.println(room_Type);
    }

    @FXML
    void confirm_click(ActionEvent event) throws IOException {
        String name = nameFld.getText();
        String nationality = nationalityFld.getText();
        String ID = IDFld.getText();
        String address = addressFld.getText();
        String city = cityFld.getText();
        String phone = phoneFld.getText();
        String email = emailFld.getText();
        //int phoneNum= Integer.parseInt(phone);
        //int idNum=Integer.parseInt(ID);
        String Days = numofDaysFld.getText();
        int numofDays = Integer.parseInt(Days);
        //int nationalID= Integer.parseInt(ID);
        DbConnect connectNOW = new DbConnect();
        Connection connectDB = connectNOW.getConnect();
        try {
            int counter = 0;
            PreparedStatement st;
            st = connectDB.prepareStatement("SELECT roomID FROM rooms WHERE roomType =? AND isBooked =?");
            st.setString(1, room_Type);
            st.setString(2, "false");
            ResultSet queryResult = st.executeQuery();
            while (queryResult.next() == true) {
                if (counter == 1) break;
                roomnumber = queryResult.getInt("roomID");
                System.out.println(roomnumber);
                counter++;
            }
        } catch (Exception e) {
        }
        try {
            DbConnect connectNOW2 = new DbConnect();
            Connection con2 = connectNOW2.getConnect();
            PreparedStatement st1;
            st1 = con2.prepareStatement("INSERT INTO `customers`(`name`, `room_ID`, `nationality`, `nationalID`, `address`, `phone`, `city`, `email`) VALUES (?,?,?,?,?,?,?,?)");
            st1.setString(1, name);
            st1.setInt(2, roomnumber);
            st1.setString(3, nationality);
            st1.setString(4, ID);
            st1.setString(5, address);
            st1.setString(6, phone);
            st1.setString(7, city);
            st1.setString(8, email);

            int status = st1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();

        }

        try {
            DbConnect connectNOW3 = new DbConnect();
            Connection con3 = connectNOW3.getConnect();
            PreparedStatement st2;
            st2 = con3.prepareStatement("UPDATE rooms SET roomType = ?, isBooked = ?, num_of_Days = ?, owner = ? WHERE roomID=?");
            st2.setString(1, room_Type);
            st2.setString(2, "true");
            st2.setInt(3, numofDays);
            st2.setString(4, name);
            st2.setInt(5, roomnumber);
            int status = st2.executeUpdate();

            // int status = st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();

        }
        HelloApplication g = new HelloApplication();
        g.changeScene("gui.fxml", 589, 493);
        ;
    }
}



