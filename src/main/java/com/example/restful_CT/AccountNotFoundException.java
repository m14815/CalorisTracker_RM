package com.example.restful_CT;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(Long userId){
        super("Could find the account: " + userId );
    }

}
