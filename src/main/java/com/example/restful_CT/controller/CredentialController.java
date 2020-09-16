package com.example.restful_CT.controller;

import com.example.restful_CT.Credential;
import com.example.restful_CT.CredentialNotFoundException;
import com.example.restful_CT.CredentialRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CredentialController{
    private final CredentialRepository credentialRepository;
    public CredentialController(CredentialRepository credentialRepository){
        this.credentialRepository = credentialRepository;
    }
    @GetMapping(value = "/credential/{credentialId}")
    public Credential getAccount(@PathVariable Long credentialId){
        return credentialRepository.findById(credentialId).orElseThrow(()->new CredentialNotFoundException(credentialId));
    }
    @GetMapping(value = "/credential")
    public List<Credential> getCredential(){
        return credentialRepository.findAll();
    }
    @PostMapping(value = "/credential")
    public void createCredential(@RequestBody Credential credential){
        credentialRepository.save(credential);
    }

}
