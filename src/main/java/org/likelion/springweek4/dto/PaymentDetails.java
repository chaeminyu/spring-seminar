package org.likelion.springweek4.dto;

public class PaymentDetails {
    private double amount;

    // 기본 생성자
    public PaymentDetails() {}

    // 생성자
    public PaymentDetails(double amount) {
        this.amount = amount;
    }

    // getter, setter
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
