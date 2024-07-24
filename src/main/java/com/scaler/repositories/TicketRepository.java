package com.scaler.repositories;

import com.scaler.models.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TicketRepository {
    private static Map<String, Ticket> tickets = new HashMap<String, Ticket>();

    public static void addTicket(Ticket ticket) {
        tickets.putIfAbsent(ticket.getTicketId(), ticket);
    }
    public static Optional<Ticket> getTicketById(String ticketId) {
        return Optional.ofNullable(tickets.get(ticketId));
    }
}
