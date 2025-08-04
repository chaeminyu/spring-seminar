package org.likelion.springweek4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @Controller + @ResponseBody 조합
@RequestMapping("/api/v1/get-api")
public class HelloController {

    // http://localhost:8080/api/v1/get-api/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/ciao")
    public String ciao() {
        return "Ciao!";
    }
}

