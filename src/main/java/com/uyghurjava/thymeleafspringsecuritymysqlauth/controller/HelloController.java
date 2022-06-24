package com.uyghurjava.thymeleafspringsecuritymysqlauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // create a mapping for "/hello"

    @GetMapping("/hello")
    public String sayHello(Model model){
        //create a mapping for "/hello"
        model.addAttribute("theDate", new java.util.Date());
        return "helloWorld";
    }
}
