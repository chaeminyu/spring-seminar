package org.likelion.springweek4.controller;
import org.likelion.springweek4.dto.MemberDto;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    // http://localhost:8080/api/v1/post-api/domain
    // TODO: 기본 POST 컨트롤러 작성

    // Map으로 받기
    // TODO: @RequestBody를 활용 + Map으로 받는 postMember() 작성
    // TODO (5장 Swagger): @Operation/@ApiResponses/@Parameters 어노테이션 추가

    // DTO로 받기
    // TODO: @RequestParam을 활용 + DTO로 받는 getRequestParam2() 작성
}
