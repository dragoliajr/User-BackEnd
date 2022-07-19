package com.ust.UserBackEnd.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String uName;
    private String password;

    public User(){}

    public User(@JsonProperty("user") String uName,
                @JsonProperty("password") String password) {
        this.uName = uName;
        this.password = password;
    }



    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                ", user='" + uName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
