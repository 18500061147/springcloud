package com.example.ribbonconsumer.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @brief
 * @author JL
 * @email li.jin@yintech.cn
 * @date 2018/10/25
 */
@Configuration
public class RestTemplateconf {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
