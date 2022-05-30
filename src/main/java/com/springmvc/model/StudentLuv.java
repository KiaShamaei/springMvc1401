package com.springmvc.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class StudentLuv {
    private String firstName;
    private String lastName ;
    private String country ;
    private LinkedHashMap<String , String> countryList ;
    private String favoritLanguage ;
    private String[] operationSystem ;

    public String[] getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String[] operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setCountryList(LinkedHashMap<String, String> countryList) {
        this.countryList = countryList;
    }

    public String getFavoritLanguage() {
        return favoritLanguage;
    }

    public void setFavoritLanguage(String favoritLanguage) {
        this.favoritLanguage = favoritLanguage;
    }

    public StudentLuv() {
        countryList = new LinkedHashMap<>();
        countryList.put("DE" , "Germany");
        countryList.put("US" , "USA");
        countryList.put("IN" , "India");
        countryList.put("CA" , "Canada");
        countryList.put("AF" , "Africa");


    }

    public LinkedHashMap<String , String> getCountryList() {
        return countryList;
    }

//    public void setCountryList(HashMap<String, String> countryList) {
//        this.countryList = countryList;
//    }



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
