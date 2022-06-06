package com.springmvc.model;

import com.springmvc.validation.CourseCode;
import org.springframework.web.bind.annotation.InitBinder;

import javax.validation.constraints.*;

public class Customer {
    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String firstName ;


    private String lastName ;

    @Max(value = 10 , message = "not larger than 10")
    @Min(value = 5, message = "not less than 5")
    @NotNull(message = "is required")
    private Integer freePasses ;
    @Pattern(regexp = "^[a-zA-z0-9]{7}" , message = "only 7 digit/chars ")
    private  String postalCode ;
    @CourseCode
    private  String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
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
