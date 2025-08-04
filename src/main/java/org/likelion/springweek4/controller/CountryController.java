// 📍 위치: src/main/java/org/likelion/springweek4/controller/CountryController.java
package org.likelion.springweek4.controller;

import org.likelion.springweek4.dto.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController // 클래스를 REST 컨트롤러로 표시하면 스프링 컨텍스트에 빈으로 추가
public class CountryController {

    // 단일 객체 반환
    @GetMapping("/france")
    public Country france() {
        Country c = Country.of("France", 67);
        return c;  // ✨ 자동으로 JSON 변환!
    }

    // 컬렉션 반환 (배열 형태의 JSON으로 변환됨)
    @GetMapping("/all")
    public List<Country> countries() {
        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Spain", 47);
        return List.of(c1, c2);  // ✨ JSON 배열로 자동 변환!
    }

    // 📍 위치: src/main/java/org/likelion/springweek4/controller/CountryController.java
    // ✨ 새로 추가되는 ResponseEntity 메서드들
    @GetMapping("/france-custom")
    public ResponseEntity<Country> franceCustom() {
        Country c = Country.of("France", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)  // 202 Accepted 상태 코드
                .header("continent", "Europe")  // 커스텀 헤더 추가
                .header("capital", "Paris")
                .header("favorite_food", "cheese and wine")
                .body(c);  // 응답 본문 설정
    }
}
