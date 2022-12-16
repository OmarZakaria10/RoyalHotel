package com.example.login2;


public class users {
    int ID  ;
    String username ,password,privilege;


    public users(int ID, String username, String password, String privilege) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.privilege = privilege;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }
}


