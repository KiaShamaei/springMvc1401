package com.springmvc.controller;


import com.springmvc.model.Student;
import com.springmvc.model.StudentLuv;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//in this class we make parent v2 for endpoint
@Controller
@RequestMapping("/v2")
public class FormControllerV2 {
    @RequestMapping("/processForm")
    public String processFormV3(@RequestParam String name, Model model){
        String theName = name;
        theName = theName.toUpperCase();
        String result = "YOOO " +  theName ;
        Student newStudent = new Student();
        newStudent.setName(result);
        model.addAttribute("student" , newStudent);
        return "helloWorld";

    }
    @RequestMapping("studentForm")
    public String showStudentForm(Model theModel){
        theModel.addAttribute("studentluv" , new StudentLuv());
        return "studentForm";

    }
    @RequestMapping("confirmStudent")
    public String confirmStudent(@ModelAttribute("studentluv") StudentLuv studentLuv ){
        System.out.println(studentLuv.getFirstName() + "  " + studentLuv.getLastName() + " " + studentLuv.getCountry());
        return "studentConfirmation";

    }
}
