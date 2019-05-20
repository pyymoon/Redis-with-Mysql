package com.ooyy;

public class User {
    private String userName;
    private String password;
    private String address;
    private Integer phoneNumber;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}
