package org.likelion.springweek4.dto;

public class ErrorDetails {
    private String message;

    // 기본 생성자
    public ErrorDetails() {}

    // 생성자
    public ErrorDetails(String message) {
        this.message = message;
    }

    // getter, setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}