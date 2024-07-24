package com.scaler.services;

import com.scaler.dtos.TicketDto;
import com.scaler.models.*;
import com.scaler.repositories.*;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    public TicketService() {

    }

    public Ticket createTicket(TicketDto ticketDto) {
        Optional<Slot> slot= SlotRepository.getSlotById(ticketDto.slotId);
        Optional<User> user = UserRepository.getUserById(ticketDto.userId);
        Optional<Operator> operator = OperatorRepository.getOperatorById(ticketDto.operatorId);
        Optional<Vehicle> vehicle= VehicleRepository.getVehicleById(ticketDto.vehicleNo);
        if(slot.isPresent() && user.isPresent() && operator.isPresent() && vehicle.isPresent()) {
        Ticket ticket=  Ticket.createBuilder()
                .slot(slot.get())
                .vehicle(vehicle.get())
                .user(user.get())
                .operator(operator.get())
                .entryDate(new Date())
                .build();

            TicketRepository.addTicket(ticket);
            return ticket;
        }
        throw new RuntimeException("Please provide valid data for this ticket");
    }

    public Optional<Ticket> getTicketById(String ticketId) {
        return TicketRepository.getTicketById(ticketId);
    }
}
