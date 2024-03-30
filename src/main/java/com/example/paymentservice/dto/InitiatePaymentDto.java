package com.example.paymentservice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InitiatePaymentDto {
    private String orderId;
    private String email;
    private String phoneNumber;
    private Long amount;

}
