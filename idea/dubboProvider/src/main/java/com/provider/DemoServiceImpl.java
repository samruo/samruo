package com.provider;

import org.springframework.stereotype.Service;

/**
 * Created by 28980 on 2018/3/8.
 */
@Service(value = "demoService")
public class DemoServiceImpl implements DemoService {
    public String sayHello() {
        System.out.println("hello provider");
        return "hello world, this is from provider";
    }
}
