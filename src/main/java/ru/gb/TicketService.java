package ru.gb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TicketService {
    private final TicketNumberGenerator generator;

    @Autowired
    public TicketService(TicketNumberGenerator generator) {
        this.generator = generator;
    }

    public Ticket createNewTicket() {
        String ticketNumber = generator.createNewNumber();
        LocalDateTime createAt = LocalDateTime.now();
        int nextTicketNumber = getNextTicketNumber();
        return new Ticket(ticketNumber, createAt, nextTicketNumber);
    }

    private static int currentTicketNumber = 1;
    private int getNextTicketNumber() {
        return currentTicketNumber++;
    }
}
