package com.cdfive.springcloud.helloworld.api;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider")
public interface HelloApi {

    @RequestMapping("hello")
    String hello(@RequestParam("name") String name);
}
