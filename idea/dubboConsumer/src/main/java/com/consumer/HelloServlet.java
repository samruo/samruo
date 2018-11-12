package com.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.provider.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 28980 on 2018/3/8.
 * http://localhost:8083/consumer/hello
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        DemoService demoService = (DemoService)context.getBean("demoService");
        response.setContentType("utf-8");
        System.out.println("hello servlet");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.println("hi, servlet");
            String sstr = demoService.sayHello();
            out.println(sstr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
