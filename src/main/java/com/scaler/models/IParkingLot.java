package com.scaler.models;

import java.util.Date;

public interface IParkingLot {
    int getTotalCapacity();
    int getTotalParkingSlots();
    int getParkingSlotsAvailable();
    int getTotalFloors();
    int getFloorsAvailable();
    Ticket generateTicket(int slotId, String operatorId, User user);
    Bill generateBill(Ticket ticker, String operatorId);
    IPayment makePayment(Ticket ticket, double amount);
    double calculateAmount(Ticket ticket, Date exitDate);
}
