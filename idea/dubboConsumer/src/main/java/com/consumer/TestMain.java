package com.consumer;

import com.provider.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 28980 on 2018/3/8.
 */
public class TestMain {
    public static void main (String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DemoService demoService = (DemoService)context.getBean("demoService");
        String str = demoService.sayHello();
        System.out.println(str);
    }
}
