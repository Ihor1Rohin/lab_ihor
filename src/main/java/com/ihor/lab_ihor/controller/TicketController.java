package com.ihor.lab_ihor.controller;

import com.ihor.lab_ihor.model.Ticket;
import com.ihor.lab_ihor.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/user/{userId}")
    public List<Ticket> getTicketsByUserId(@PathVariable Integer userId) {
        return ticketService.getTicketsByUserId(userId);
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }
}