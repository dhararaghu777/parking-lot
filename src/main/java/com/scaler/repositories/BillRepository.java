package com.scaler.repositories;

import com.scaler.models.Bill;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class BillRepository {
    private static Map<String, Bill> bills = new HashMap<String, Bill>();

    public static void addBill(Bill bill) {
        bills.putIfAbsent(bill.getBillId(), bill);
    }
    public static Optional<Bill> getBillById(String billId) {
        return Optional.ofNullable(bills.get(billId));
    }
}
