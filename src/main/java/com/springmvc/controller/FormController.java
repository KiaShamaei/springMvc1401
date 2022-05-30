package com.springmvc.controller;


import com.springmvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.StringTokenizer;

@Controller
public class FormController {
    //controller to show form
    @RequestMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("student" , new Student());
        return "showForm";
    }
    //process form
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute Student student , Model model){
        model.addAttribute("student" , student);
        System.out.println("service is call");
        return "helloWorld";

    }
    @RequestMapping("/processFormv2")
    public String processFormV2(@ModelAttribute Student student , Model model){
        String theName = student.getName();
        theName = theName.toUpperCase();
        String result = "YOOO " +  theName ;
        Student newStudent = new Student();
        newStudent.setName(result);
        model.addAttribute("student" , newStudent);
        return "helloWorld";

    }


}
