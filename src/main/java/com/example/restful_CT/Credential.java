package com.example.restful_CT;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CREDENTIALS")
public class Credential {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "credential_id")
    private Long credentialId;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String passwordHash;
    @Column(nullable = false)
    private Date signupDate;
    @OneToOne(mappedBy = "credential")
    private Account account;
    public Credential(){

    }
    public Credential(Long credentialId, String userName, String passwordHash){
        this.credentialId = credentialId;
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.signupDate = new Date();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    public Date getSignupDate() {
        return signupDate;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Credential)) return false;
        Credential that = (Credential) o;
        return credentialId.equals(that.credentialId) &&
                userName.equals(that.userName) &&
                passwordHash.equals(that.passwordHash) &&
                signupDate.equals(that.signupDate) &&
                account.equals(that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentialId, userName, passwordHash, signupDate, account);
    }
}
