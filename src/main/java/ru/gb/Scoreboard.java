package ru.gb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Scoreboard {
    private final TicketService ticketService;

    public Scoreboard(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public void scoreboardNewTicket() {
        Ticket ticket = ticketService.createNewTicket();
        System.out.println(ticket);
    }
}
