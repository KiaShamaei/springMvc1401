package com.springmvc.validation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode , String> {
    private String coursePrefix;
    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        //this part we can add our logic for this custome annotation
        boolean result ;
        if(theCode != null){
            result = theCode.startsWith(coursePrefix);
        }else{
            // this part show that this field is required ...
            result = false;
        }

        return result;
    }

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }

}
