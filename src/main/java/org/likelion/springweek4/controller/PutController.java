package org.likelion.springweek4.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.likelion.springweek4.dto.MemberDto;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    // Map으로 받기
    // TODO: @RequestBody를 활용 + Map으로 받는 putMember() 작성

    // DTO로 받기 - String 반환
    @PutMapping("/member1")
    public String postMemberDto1(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // DTO로 받기 - DTO 반환 (JSON 응답)
    // TODO: @RequestBody를 활용 + DTO로 받는 putMemberDto2() 작성

    // ResponseEntity 활용
    // TODO: ResponseEntity 활용하는 putMemberDto3() 작성
}