package com.example.restful_CT.controller;

import com.example.restful_CT.Account;
import com.example.restful_CT.AccountNotFoundException;
import com.example.restful_CT.AccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    private final AccountRepository accountRepository;
    public AccountController(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    /**
     * Get a single account info by search userID
     * @param userId the userID is used for searching in DB
     * @return an mapped account info wll be returned, if not exist, return an error message.
     */
    @GetMapping(value = "/account/{userId}")
    public Account getAccount(@PathVariable Long userId){
        return accountRepository.findById(userId).orElseThrow(() -> new AccountNotFoundException(userId));
    }

    /**
     * Get all accounts info in DB
     * @return all accounts info in DB
     */
    @GetMapping(value = "/account")
    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    /**
     * Create a new account
     * @param newAccount a new account
     */
    @PostMapping(value = "/account")
    public void createAccount(@RequestBody Account newAccount){
        accountRepository.save(newAccount);
    }

    /**
     * Update an account
     * @param userId the account id
     * @param updatedAccount account updated some info
     */
    @PutMapping(value = "/account/{userId}")
    public void updateAccount(@PathVariable Long userId, @RequestBody Account updatedAccount){
        accountRepository.findById(userId).map(
                account -> {
                    account.setAddress(updatedAccount.getAddress());
                    account.setEmail(updatedAccount.getAddress());
                    account.setHeight(updatedAccount.getHeight());
                    account.setWeight(updatedAccount.getWeight());
                    account.setLA(updatedAccount.getLA());
                    account.setSM(updatedAccount.getSM());
                    account.setPostcode(updatedAccount.getPostcode());
                    account.setFirstName(updatedAccount.getFirstName());
                    return accountRepository.save(account);
                }
        );
    }

    /**
     * Delete a specific account
     * @param userId the id of the specific account
     */
    @DeleteMapping(value = "/account/{userId}")
    public void deleteAccount(@PathVariable Long userId){
        accountRepository.deleteById(userId);
    }
}
