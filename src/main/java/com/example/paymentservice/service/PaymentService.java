package com.example.paymentservice.service;

import com.example.paymentservice.paymentgateway.PaymentGateway;
import com.example.paymentservice.paymentgateway.PaymentGatewayStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayStrategy paymentGatewayStrategy;

    public String initiatePayment(String orderId, String email, String phoneNumber, Long amount){
        PaymentGateway paymentGateway = paymentGatewayStrategy.getBestPaymentGateway();
        return paymentGateway.generatePaymentLink(orderId, email, phoneNumber, amount);
    }

}
