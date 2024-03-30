package com.example.paymentservice.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PaymentGatewayStrategy {

    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;
    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGateway getBestPaymentGateway(){
        return razorpayPaymentGateway;
    }


}
