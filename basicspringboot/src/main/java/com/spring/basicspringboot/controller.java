package com.spring.basicspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Greetings")
public class controller {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

}
