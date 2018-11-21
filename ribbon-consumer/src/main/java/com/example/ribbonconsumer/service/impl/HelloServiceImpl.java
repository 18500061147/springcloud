package com.example.ribbonconsumer.service.impl;

import com.example.ribbonconsumer.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "fallBack")
    public String helloService() {
        System.out.print("进入service");
        return restTemplate.getForEntity("http://service1/hello/say",String.class).getBody();
    }

    @Override
    public String fallBack() {
        System.out.print("回执");
        return "error";
    }


}
