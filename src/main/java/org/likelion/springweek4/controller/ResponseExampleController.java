package org.likelion.springweek4.controller;

import org.likelion.springweek4.dto.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 📍 위치: src/main/java/org/likelion/springweek4/controller/ResponseExampleController.java
@RestController
public class ResponseExampleController {

    // 1. 성공 응답 (200 OK)
    @GetMapping("/success")
    public ResponseEntity<String> success() {
        return ResponseEntity.ok("성공적으로 처리되었습니다");
    }

    // 2. 생성 응답 (201 Created)
    @PostMapping("/create")
    public ResponseEntity<Country> create() {
        Country country = Country.of("Korea", 51);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(country);
    }

    // 3. 허용됨 응답 (202 Accepted)
    @PutMapping("/update")
    public ResponseEntity<Country> update() {
        Country country = Country.of("Updated Country", 100);
        return ResponseEntity
                .accepted()  // 202 Accepted 상태 코드
                .body(country);
    }

    // 4. 잘못된 요청 (400 Bad Request)
    @GetMapping("/bad-request")
    public ResponseEntity<String> badRequest() {
        return ResponseEntity
                .badRequest()
                .body("잘못된 요청입니다");
    }

    // 5. 헤더와 함께 응답
    @GetMapping("/with-headers")
    public ResponseEntity<Country> withHeaders() {
        Country country = Country.of("France", 67);

        return ResponseEntity.ok()
                .header("Custom-Header", "Custom-Value")
                .header("Cache-Control", "no-cache")
                .body(country);
    }
}