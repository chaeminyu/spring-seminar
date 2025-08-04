package org.likelion.springweek4.controller;
import org.likelion.springweek4.dto.MemberDto;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    // http://localhost:8080/api/v1/post-api/domain
    @PostMapping(value = "/domain")
    public String postExample() {
        return "Hello Post API!";
    }

    // Map으로 받기
    @PostMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    // DTO로 받기
    @PostMapping("/member2")
    public String postMemberDto(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
}
