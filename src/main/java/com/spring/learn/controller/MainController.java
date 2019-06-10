package com.spring.learn.controller;

import com.spring.learn.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/sendmail")
    public String sendmail() {
        emailService.sendEmail("evoletah101096@gmail.com", "Test Subject", "Test mail");
        return "emailsent";
    }
}
