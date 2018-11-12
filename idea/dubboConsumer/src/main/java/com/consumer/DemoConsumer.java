package com.consumer;

import com.provider.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 28980 on 2018/3/8.
 */
@Controller
@RequestMapping(value="/demoConsumer")
public class DemoConsumer {
   /* @Autowired
    private DemoService demoService;

    public ModelAndView demo(HttpServletRequest request, HttpServletResponse response){
        System.out.println("success");
        String str = demoService.sayHello();
        System.out.println(str);
        return null;
    }*/
}
