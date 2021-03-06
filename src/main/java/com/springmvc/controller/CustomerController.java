package com.springmvc.controller;


import com.springmvc.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class , stringTrimmerEditor);
    }

    @RequestMapping("")
    public String showCustomerForm (Model theModel){
        theModel.addAttribute("customer" , new Customer());
        return "customer-form";

    }
    @RequestMapping("/processForm")
    public String processCustomerForm(@Valid @ModelAttribute("customer") Customer theCustomer , BindingResult theBinding){
        if(theBinding.hasErrors()){
            return "customer-form";
        }else{
            return "customer-confirmation";
        }

    }
}
