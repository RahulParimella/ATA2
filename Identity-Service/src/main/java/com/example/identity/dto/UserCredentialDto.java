package com.example.identity.dto;

public class UserCredentialDto {
    private int userId;
    private String name;
    private String dob;
    private String gender;
    private String address;
    private String mobile;
    private String email;
    private String password;
    private String role;

    public UserCredentialDto() {
        // Default constructor
    }

    public UserCredentialDto(int userId, String name, String dob, String gender, String address, String mobile, String email, String password, String role) {
        this.userId = userId;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}