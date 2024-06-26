package com.telran.springcontainerconfigexample;

import com.telran.springcontainerconfigexample.beans.ValidatorHelper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.telran.springcontainerconfigexample.beans")
@PropertySource("classpath:application.properties")
//@SpringBootApplication
public class AppContext {

//    @Bean
//    public Country france() {
//        Country country = new Country();
//        country.setName("France");
//        country.setCode("FR");
//        country.setLanguage("French");
//        return country;
//    }
//
//    @Bean(name = "myValidator")
//    public Validator validator() {
//        Validator validator = new Validator();
//        validator.setCountry(france());
//        return validator;
//    }

    @Bean
    public ValidatorHelper helperOne() {
        return new ValidatorHelper();
    }

    @Bean
    public ValidatorHelper helperTwo() {
        return new ValidatorHelper();
    }



}
