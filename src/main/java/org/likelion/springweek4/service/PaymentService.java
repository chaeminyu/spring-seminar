package org.likelion.springweek4.service;

import org.likelion.springweek4.dto.PaymentDetails;
import org.likelion.springweek4.exception.NotEnoughMoneyException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        // 테스트를 위해 항상 예외 발생
        // 실제로는 잔액 확인 로직이 들어갈 부분
        throw new NotEnoughMoneyException();
    }
}