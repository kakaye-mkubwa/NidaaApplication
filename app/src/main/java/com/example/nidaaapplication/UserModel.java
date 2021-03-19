package com.example.nidaaapplication;

public class UserModel {
    private String fullName;
    private String phoneNumber;
    private String email;
    private String bloodType,password;

    public UserModel(String fullName, String phoneNumber, String email, String bloodType, String password) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.bloodType = bloodType;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
