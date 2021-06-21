package com.example.assignsem4ead.service;

import com.example.assignsem4ead.controller.AccountController;
import com.example.assignsem4ead.entity.Account;
import com.example.assignsem4ead.entity.Credential;
import com.example.assignsem4ead.repo.AccountRepository;
import com.example.assignsem4ead.repo.CredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CredentialRepository credentialRepository;

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public Account login(Account account){
        Credential credential;
        account.setPasswordHash(bCryptPasswordEncoder.encode(account.getPassword()));
        Account result = accountRepository.findAccountByUsernameAndPasswordHash(account.getUsername(), account.getPasswordHash());
        if(result != null){
            credential = credentialRepository.findByAccountId(result.getId());
            Set<Credential> credentialSet = new HashSet<>();
            credentialSet.add(credential);
            result.setCredentialSet(credentialSet);
            AccountController.loginList.add(result);
        }
        return result;
    }

    public Account getUser(Long id) {
        return accountRepository.getOne(id);
    }
}
