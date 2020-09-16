package com.example.restful_CT;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "ACCOUNTS")
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "first_name")
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
    @OneToOne
    @JoinColumn(name = "credential_id")
    @RestResource(path = "accountCredential", rel = "credential")
    private Credential credential;
//    @OneToMany(mappedBy = "user_id")
//    @JoinColumn(name = "report_id")
//    @RestResource(path = "accountReports", rel = "report")
//    private List<Report> reports;
    @OneToMany(mappedBy = "account")
    private List<Consumption> consumptions;
    public Account(){
    }
    public Account(long userId){
        this.userId = userId;
    }
    public Account(long userId, String firstName, String lastName){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = "";
        this.email = "";
        this.DB = new Date(1990);
        this.address = "";
        this.postcode = 0;
        this.height = 0;
        this.weight = 0;
        this.LA = 1;
        this.SM = 1;
    }
    public Account(long userId, String firstName, String lastName, String gender, String email,
                   Date DB, String address, int postcode, float height, float weight, int LA, int SM) {
        this.userId = userId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return postcode == account.postcode &&
                Float.compare(account.height, height) == 0 &&
                Float.compare(account.weight, weight) == 0 &&
                LA == account.LA &&
                SM == account.SM &&
                userId.equals(account.userId) &&
                firstName.equals(account.firstName) &&
                lastName.equals(account.lastName) &&
                gender.equals(account.gender) &&
                email.equals(account.email) &&
                DB.equals(account.DB) &&
                address.equals(account.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName, gender, email, DB, address, postcode, height, weight, LA, SM);
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", DB=" + DB +
                ", address='" + address + '\'' +
                ", postcode=" + postcode +
                ", height=" + height +
                ", weight=" + weight +
                ", LA=" + LA +
                ", SM=" + SM +
                '}';
    }
}
