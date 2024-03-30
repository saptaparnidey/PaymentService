package com.example.paymentservice.paymentgateway;

public interface PaymentGateway {

    String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount);
}
