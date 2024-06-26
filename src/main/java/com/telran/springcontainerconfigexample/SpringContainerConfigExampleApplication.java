package com.telran.springcontainerconfigexample;

import com.telran.springcontainerconfigexample.beans.Country;
import com.telran.springcontainerconfigexample.beans.UseBeans;
import com.telran.springcontainerconfigexample.beans.Validator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringContainerConfigExampleApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringContainerConfigExampleApplication.class, args);
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
        ConfigurableApplicationContext context = SpringApplication.run(AppContext.class);

        Country france = (Country) context.getBean("country");
        System.out.println(france);

        Validator validator = (Validator) context.getBean("myValidator");
        validator.validate();

        Validator validator2 = new Validator();
        validator2.validate();

        Validator validator3 = (Validator) context.getBean("myValidator");
        System.out.println(validator == validator3); // singleton - prototype

        UseBeans useBeans = (UseBeans) context.getBean("useBeans");
        useBeans.process();

        context.close();
//        context.getBean("myValidator");
    }

}
