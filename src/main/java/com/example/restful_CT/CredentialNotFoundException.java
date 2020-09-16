package com.example.restful_CT;

public class CredentialNotFoundException extends RuntimeException{
    public CredentialNotFoundException(Long credentialId){
        super("Credential Not Found, ID: "+ credentialId);
    }
}
