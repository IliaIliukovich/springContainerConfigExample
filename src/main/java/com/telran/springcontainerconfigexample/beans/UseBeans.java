package com.telran.springcontainerconfigexample.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseBeans {

//    @Autowired
    private Validator validator;

//    @Autowired
    private Country country;

//    @Autowired

    public UseBeans() {
    }

    @Autowired
    public UseBeans(Validator validator, Country country) {
        this.validator = validator;
        this.country = country;
    }

//    @Autowired
//    public void setValidator(Validator validator) {
//        this.validator = validator;
//    }
//
//    @Autowired
//    public void setCountry(Country country) {
//        this.country = country;
//    }

    public void process() {
        validator.validate();
        System.out.println(country.getName());
    }

}
