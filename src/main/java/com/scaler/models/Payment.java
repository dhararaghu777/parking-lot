package com.scaler.models;

public interface Payment {
    boolean makePayment(int amount);
    String getPaymentInfo(String paymentId);
}
