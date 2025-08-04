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
    // TODO: 단일 객체 반환하는 france() 작성

    // 컬렉션 반환 (배열 형태의 JSON으로 변환됨)
    // TODO: 컬렉션 반환하는 all() 작성

    // 📍 위치: src/main/java/org/likelion/springweek4/controller/CountryController.java
    // ✨ 새로 추가되는 ResponseEntity 메서드들
    // TODO: ResponseEntity 메서드 - franceCustom() 작성
}
