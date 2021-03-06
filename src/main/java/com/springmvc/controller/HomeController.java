package com.springmvc.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${welcome.message}")
    private String message ;
    @RequestMapping("/")
    public String showPage(Model model){
        System.out.println("this test page ");
        model.addAttribute("message" , message);
        return  "index";
    }
}
