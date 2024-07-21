package com.scaler.models;

import java.util.List;

public interface ParkingLot {
    int getTotalCapacity();
    int getTotalParkingSlots();
    int getParkingSlotsAvailable();
    int getTotalFloors();
    int getFloorsAvailable();
    List<User> getTotalUsers();
    List<User> getParkingUsers();
    Ticket generateTicket(User user);
    Bill generateBill(Ticket ticker);
    Payment makePayment(Ticket ticket);
}
