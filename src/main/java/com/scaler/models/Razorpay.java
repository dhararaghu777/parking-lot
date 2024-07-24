package com.scaler.models;

public class Razorpay implements IPayment {
    private String paymentId;
    private double amount;
    @Override
    public boolean makePayment(double amount) {
        return true;
    }
    @Override
    public String getPaymentInfo(String paymentId) {
        return "Payment Id: " + paymentId + " Amount: " + amount;
    }
}
