//package org.likelion.springweek4.advice;
//
//import org.likelion.springweek4.dto.ErrorDetails;
//import org.likelion.springweek4.exception.NotEnoughMoneyException;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//
//@RestControllerAdvice  // REST 컨트롤러 어드바이스임을 표시
//public class ExceptionControllerAdvice {
//
//    // 방법 2 주석 해제 시 해제하면 되는 메서드: NotEnoughMoneyException이 발생할 때 실행되는 예외 핸들러
//    @ExceptionHandler(NotEnoughMoneyException.class)
//    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
//        ErrorDetails errorDetails = new ErrorDetails();
//        errorDetails.setMessage("Not enough money to make payment");
//
//        return ResponseEntity
//                .badRequest()  // 400 Bad Request
//                .body(errorDetails);
//    }
//}
