package com.ing.assignment.bankaccount.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(path="/newAccount")
    public String newAccountPage(Model model) {
        return "newBankAccount";
    }
}
