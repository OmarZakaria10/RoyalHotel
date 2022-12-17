package com.example.login2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class foodcontroller {
    //private boolean bf=false,l=false,d=false;
    @FXML
    private CheckBox breakfast_checkbox;
    @FXML
    private CheckBox lunch_checkbox;
    @FXML
    private CheckBox dinner_checkbox;
    @FXML
    private Button food_button;
    @FXML
    private TextField roomIDFld;
    int bf=0,l=0,d=0;

    public void breakfast_checkbox_marked(MouseEvent mouseEvent) {
        bf=1;
    }

    public void lunch_checkbox_marked(MouseEvent mouseEvent) {
        l=1;
    }

    public void dinner_checkbox_marked(MouseEvent mouseEvent) {
        d=1;
    }
    @FXML
    void food_button_clicked(ActionEvent e) throws IOException, SQLException {
        String room_id= roomIDFld.getText();
        DbConnect connectNOW =new DbConnect();
        Connection connectDB =connectNOW.getConnect();

        //String addfood= "INSERT INTO count(1) FROM `food` (`ID`, `breakfast`, `lunch`, `dinner`) VALUES ('"+bf+"', '"+l+"', '"+d+"')";
        try{
            PreparedStatement st;
            st= connectDB.prepareStatement("INSERT INTO food (`RoomID`,`breakfast`, `lunch`, `dinner`) VALUES (?,?,?,?)");
            st.setString(1,room_id);
            st.setInt(2,bf);
            st.setInt(3,l);
            st.setInt(4,d);
            int status= st.executeUpdate();
            //Statement statement = connectDB.createStatement();
            //ResultSet queryResult = st.executeQuery(st);
            HelloApplication m = new HelloApplication();
            m.changeScene("gui.fxml",550,400);
        }
        catch (Exception error)
        {
            error.printStackTrace();
        }
    }


}
