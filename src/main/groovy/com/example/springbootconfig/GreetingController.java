package com.example.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${default.greeting}")
    private String greetingMessage;

//    @Value("${app.name}")
//    private String appName;

    @Value("${app.description}")
    private String appDescription;

    @GetMapping("/greeting")
    public String greeting(){

//        return "Hello World!"; // hardcoding
        return greetingMessage + "\n" + appDescription; // injecting values from application.properties
    }

}
