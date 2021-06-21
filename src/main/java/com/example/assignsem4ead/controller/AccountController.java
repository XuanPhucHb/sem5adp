package com.example.assignsem4ead.controller;

import com.example.assignsem4ead.entity.Account;
import com.example.assignsem4ead.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/nxp/v1/account")
public class AccountController {

    public static List<Account> loginList = new ArrayList<>();

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/loginAc", method = RequestMethod.POST)
    public Account login(@RequestBody Account account) {
        return accountService.login(account);
    }

    @RequestMapping(value = "/getInfo/{id}", method = RequestMethod.GET)
    public Account login(@PathVariable Long id) {
        return accountService.getUser(id);
    }
}
