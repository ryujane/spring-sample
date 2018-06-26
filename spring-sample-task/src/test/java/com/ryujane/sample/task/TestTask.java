package com.ryujane.sample.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RyuJane
 */
public class TestTask {
    public static void main(String[] args) {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-a.xml");
    }
}
