package com.telran.springcontainerconfigexample.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

    public Country() {
//        this.setName("France");
//        this.setCode("FR");
//        this.setLanguage("French");
    }

    @Value("${country.name}")
    private String name;

    @Value("${country.code}")
    private String code;

    @Value("${country.language}")
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
