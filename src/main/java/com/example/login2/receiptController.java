package com.example.login2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class receiptController extends  CheckoutController{
    @FXML
    private Label roomtype_label;
    @FXML
    private Label roomtype_price;
    @FXML
    private Label food_label;
    @FXML
    private Label food_price;
    @FXML
    private Label days_number;
@FXML
private Button show_button;
    @FXML
    private Label total;
    private String rs;
    private String roomtype;
    private int days;
    private int bf=0,l=0,d=0,food;
    private int vipprice=5000,normalprice=3000,economyprice=1000,price;

    public void show_receipt (ActionEvent event) throws Exception {
        DbConnect connectNOW = new DbConnect();
        Connection connectDB = connectNOW.getConnect();
        try {
            PreparedStatement st1,st2;
            //String room_type_statement = "SELECT roomType,num_of_Days FROM `rooms` WHERE `roomID` =" + CheckoutController.roomnumber;
            st1 = connectDB.prepareStatement("SELECT roomType,num_of_Days FROM `rooms` WHERE `roomID`="+CheckoutController.roomnumber);
           st2=connectDB.prepareStatement("SELECT breakfast,lunch,dinner FROM `food` WHERE `roomID`="+CheckoutController.roomnumber);
            ResultSet rs1 = st1.executeQuery();
            ResultSet rs2=st2.executeQuery();
            while (rs1.next() == true){
           roomtype = rs1.getString("roomType");
            days = rs1.getInt("num_of_Days");}
            if("VIP".equals(roomtype))
            {
                price=vipprice;
            }
            else if ("Normal".equals(roomtype))
            {
                price=normalprice;
            }
            else if("Econonmy".equals(roomtype))
            {
                price=economyprice;
            }
            System.out.println("roomtype "+roomtype);
            System.out.println("number of days "+days);
            System.out.println("price"+price);
            roomtype_label.setText(roomtype);
            roomtype_price.setText(""+price+"");
            days_number.setText(""+days+"");
            while (rs2.next() == true){
                bf= rs2.getInt("breakfast");
                l= rs2.getInt("lunch");
                d=rs2.getInt("dinner");
            }
            food=bf+l+d;
            food_label.setText(""+food+" meals");
            food_price.setText(""+food*50+"L.E/day");
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
