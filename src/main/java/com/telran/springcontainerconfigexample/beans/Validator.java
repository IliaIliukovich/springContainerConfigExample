package com.telran.springcontainerconfigexample.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myValidator")
//@Scope("prototype")
public class Validator {

    @Autowired
    private Country country;

    @Autowired
    @Qualifier("helperOne")
    private ValidatorHelper helper1;

    @Autowired
    @Qualifier("helperTwo")
    private ValidatorHelper helper2;

    public Validator() {
    }

    public Validator(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void validate() {
        System.out.println("Validating data for country: " + country);
    }

    @PostConstruct
    public void init() {
        System.out.println("Validator init method");
    }

    @PreDestroy
    public void finalActions() {
        System.out.println("Validator clean up");
    }



}
