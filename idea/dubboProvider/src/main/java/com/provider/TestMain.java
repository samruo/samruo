package com.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 28980 on 2018/3/8.
 */
public class TestMain {
    public static void main (String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        String str = demoService.sayHello();
        System.out.println(str);
    }
}
