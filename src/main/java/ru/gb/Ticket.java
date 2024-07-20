package ru.gb;

import java.time.LocalDateTime;

public class Ticket {

    private String number;
    private LocalDateTime createdAt;
    private int numberOfTicket;

    public Ticket(String number, LocalDateTime createdAt, int numberOfTicket) {
        this.number = number;
        this.createdAt = createdAt;
        this.numberOfTicket = numberOfTicket;
    }

    @Override
    public String toString() {
        return "Ticket{" +
               "number='" + number + '\'' +
               ", createdAt=" + createdAt +
               ", numberOfTicket=" + numberOfTicket +
               '}';
    }
}
