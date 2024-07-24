package com.scaler.controllers;

import com.scaler.dtos.BillDto;
import com.scaler.dtos.BillResponseDto;
import com.scaler.models.Bill;
import com.scaler.services.BillService;

import java.util.Optional;

public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    public BillResponseDto generateBill(BillDto billDto){
        Bill bill = billService.generateBill(billDto);
        BillResponseDto billResponseDto = new BillResponseDto();
        billResponseDto.bill= bill;
        return billResponseDto;
    }
    public BillResponseDto getBillDetails(String billId){
        Optional<Bill> bill= billService.findBillById(billId);
        if(bill.isEmpty()) throw new RuntimeException("Bill is not available");
        BillResponseDto billResponseDto = new BillResponseDto();
        billResponseDto.bill = bill.get();
        return billResponseDto;
    }
}
