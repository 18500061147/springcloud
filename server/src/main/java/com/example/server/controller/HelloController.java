package com.example.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

@RestController
@RequestMapping
@Slf4j
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String Hello()
    {
        ServiceInstance serviceInstance=client.getLocalServiceInstance();
        log.info("/hello,host"+serviceInstance.getHost()+",  service_id"+serviceInstance.getServiceId());
        return "Hello World";
    }
}
