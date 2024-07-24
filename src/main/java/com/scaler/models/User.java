package com.scaler.models;

import java.util.UUID;

public abstract class User {
    private String id;
    private String name;
    private String mobile;
    private UserType userType;

    public User(String name, String mobile, UserType userType){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.mobile = mobile;
        this.userType = userType;
    }

    public String getId() {
        return id;
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
