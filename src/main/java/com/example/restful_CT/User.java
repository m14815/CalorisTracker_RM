package com.example.restful_CT;

import java.sql.Date;

public class User {
    private long userId;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private Date DB; //date of birth
    private String address;
    private int postcode;
    private float height;
    private float weight;
    private int LA; //level of activity
    private int SM; // step per mile
    public User(long userId, String firstName, String lastName, String gender, String email,
                Date DB, String address, int postcode, float height, float weight, int LA, int SM){
        this.userId =  userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.DB = DB;
        this.address = address;
        this.postcode = postcode;
        this.height = height;
        this.weight = weight;
        this.LA = LA;
        this.SM = SM;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDB() {
        return DB;
    }

    public void setDB(Date DB) {
        this.DB = DB;
    }

    public int getLA() {
        return LA;
    }

    public void setLA(int LA) {
        this.LA = LA;
    }

    public int getSM() {
        return SM;
    }

    public void setSM(int SM) {
        this.SM = SM;
    }
}
