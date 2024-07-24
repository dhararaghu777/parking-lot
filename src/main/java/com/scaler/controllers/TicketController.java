package com.scaler.controllers;

import com.scaler.dtos.TicketDto;
import com.scaler.dtos.TicketResponseDto;
import com.scaler.models.Ticket;
import com.scaler.services.TicketService;

import java.util.Optional;

public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketResponseDto createTicket(TicketDto ticketDto) {
        Ticket ticket = ticketService.createTicket(ticketDto);
        TicketResponseDto ticketResponseDto = new TicketResponseDto();
        ticketResponseDto.ticket= ticket;
        return ticketResponseDto;
    }
    public TicketResponseDto getTicketDetails(String ticketId) {
        Optional<Ticket> ticket = ticketService.getTicketById(ticketId);
        if(ticket.isEmpty()) throw new RuntimeException("Ticket is not available");
        TicketResponseDto ticketResponseDto = new TicketResponseDto();
        ticketResponseDto.ticket= ticket.get();
        return ticketResponseDto;
    }
}
