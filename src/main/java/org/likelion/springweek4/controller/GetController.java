package org.likelion.springweek4.controller;

import org.likelion.springweek4.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    // http://localhost:8080/api/v1/get-api/variable1/hello
    // TODO: @PathVariable을 활용한 getvariable1() 작성


    // 변수명이 다를 때
    // TODO: @PathVariable을 활용한 getvariable2() 작성


    // http://localhost:8080/api/v1/get-api/request1?name=value1&email=value2&organization=value3
    // TODO: @RequestParam을 활용한 getRequestParam1() 작성


    // Map으로 받기 (매개변수가 일정하지 않을 때)
    // TODO: @RequestParam을 활용한 getRequestParam2() 작성


    // http://localhost:8080/api/v1/get-api/request3?name=value1&email=value2&organization=value3
    @GetMapping("/request3")
    public String getRequestParam3(MemberDto memberDto) {
        return memberDto.toString();
    }
}
