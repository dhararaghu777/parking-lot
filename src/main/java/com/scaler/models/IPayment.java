package com.scaler.models;

public interface IPayment {
    boolean makePayment(double amount);

    String getPaymentInfo(String paymentId);
}
