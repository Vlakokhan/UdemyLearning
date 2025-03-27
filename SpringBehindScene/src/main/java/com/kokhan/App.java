package com.kokhan;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = context.getBean("alien", Alien.class);
        System.out.println(obj.getAge());
        obj.code();


//        Desktop obj1 = context.getBean(Desktop.class);
    }
}
