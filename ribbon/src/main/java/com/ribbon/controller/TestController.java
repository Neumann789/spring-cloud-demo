package com.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String info() {
        return restTemplate.getForEntity("http://SERVICE1/hello", String.class).getBody();
    }
}
