package com.cdfive.springcloud.helloworld.controller;

import com.cdfive.springcloud.helloworld.api.HelloApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HelloApi helloApi;

    @RequestMapping(value = "/test")
    public String hello(String name) {
        return "test=>" + restTemplate.getForEntity("http://provider/hello?name=" + name, String.class).getBody();
    }

    @RequestMapping(value = "/test2")
    public String hello2(String name) {
        return "test2=>" + helloApi.hello(name);
    }
}