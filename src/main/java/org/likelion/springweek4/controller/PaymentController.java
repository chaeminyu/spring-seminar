package org.likelion.springweek4.controller;

import org.likelion.springweek4.dto.ErrorDetails;
import org.likelion.springweek4.dto.PaymentDetails;
import org.likelion.springweek4.exception.NotEnoughMoneyException;
import org.likelion.springweek4.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// 📍 방법 1 (방법 1 코드를 지우고 방법 2 코드로 채우세요!)
@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
        try {
            PaymentDetails paymentDetails = paymentService.processPayment();

            // 성공 시: Accepted 상태와 PaymentDetails 반환
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);

        } catch (NotEnoughMoneyException e) {
            // 예외 발생 시: Bad Request 상태와 ErrorDetails 반환
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enough money to make the payment");

            return ResponseEntity
                    .badRequest()
                    .body(errorDetails);
        }
    }
}
