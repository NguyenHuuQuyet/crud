package com.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("")
    public String showHomePage(){
        System.out.println("main controller");
        System.out.println("test");
        return "index";
    }
}
