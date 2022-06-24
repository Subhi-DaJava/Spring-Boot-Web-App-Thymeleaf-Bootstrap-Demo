package com.uyghurjava.thymeleafspringsecuritymysqlauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    // create a mapping for "/login"

    @GetMapping("/loginPage")
    public String loginPage(){

        return "loginPage";
    }

    // add request mapping for /access-denied
    @GetMapping("/access-denied")
    public String showAccessDenied() {

        return "access-denied";

    }
}
