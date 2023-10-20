package com.practice.firstproject.controller;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.firstproject.modal.User;
import com.practice.firstproject.service.UserServiceIMPL;

@Controller
public class FirstCon {

    @Autowired
     private UserServiceIMPL service;

    @GetMapping("/")
    public String Register() {

        return "index";
    }

    @GetMapping("/show")
    public String Show() {

        return "show";
    }

    @PostMapping("/Add")
    public String AddData(@ModelAttribute User log) {
        service.addData(log);
    return "show";

    }

   
    @GetMapping("/Read")
    public String yourPage(Model model) {
        List<User> datalist = service.fetchUserList();
        model.addAttribute("datalist", datalist);
        return "show"; 
    }

}
