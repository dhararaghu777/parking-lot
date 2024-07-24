package com.scaler.services;

import com.scaler.dtos.BillDto;
import com.scaler.dtos.BillResponseDto;
import com.scaler.models.*;
import com.scaler.repositories.BillRepository;
import com.scaler.repositories.OperatorRepository;
import com.scaler.repositories.TicketRepository;

import java.util.Date;
import java.util.Optional;

public class BillService {

    public Bill generateBill(BillDto billDto){
        Optional<Ticket> ticket= TicketRepository.getTicketById(billDto.ticketId);
        Optional<Operator> operator= OperatorRepository.getOperatorById(billDto.operatorId);
        if(ticket.isEmpty()){
            throw new RuntimeException("Ticket is not found");
        }
        if(operator.isEmpty()){
            throw new RuntimeException("Operator is not found");
        }
        Date exitDate= new Date();
        double amount= calculatePrice(ticket.get(), exitDate);
        IPayment payment= makePayment(ticket.get(), amount);

        Bill bill= Bill.createBuilder()
                .exitDate(exitDate)
                .payment(payment)
                .ticket(ticket.get())
                .operator(operator.get())
                .build();
        BillRepository.addBill(bill);
        return bill;
    }
    private double calculatePrice(Ticket ticket, Date exitDate){
        double totalTime=  (exitDate.getTime() - ticket.getEntryDate().getTime())*1000*60*60;
        return totalTime*20;
    }
    private IPayment makePayment(Ticket ticket, double amount){
        IPayment payment= new Razorpay();
        boolean isSuccessful= payment.makePayment(amount);
        if(isSuccessful){
            return payment;
        }
        throw new RuntimeException("Payment failed");
    }

    public Optional<Bill> findBillById(String billId){
       return BillRepository.getBillById(billId);
    }
}
