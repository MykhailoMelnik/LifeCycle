package com.lifecycle.controller;

import com.lifecycle.model.User;
import com.lifecycle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String dateOfBirth() {
        return "date_of_birth";
    }

    @PostMapping("result")
    public String result(@ModelAttribute User user, Model model){
        User.counter ++;
        model.addAttribute("userCounter", User.getCounter());
        model.addAttribute("firstname", user.getFirstname());
        model.addAttribute("interestingFact", userService.getUserRandomFact(user));

        return "result";
    }
}
