package com.scaler.models;

public abstract class User {
    private int id;
    private String name;
    private String mobile;
    private UserType userType;

    public User(int id, String name, String mobile, UserType userType){
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
