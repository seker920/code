package com.example.tickets.model;

public class RailwayTicket {

    private float ticketPrice; // стоимость взрослого билета
    private int numberOfTickets; // количество билетов


    public RailwayTicket() {

    }

    public RailwayTicket(float ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;

    }

    public float ticketPriceAll(){
        return ticketPrice * numberOfTickets;
    }
    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice() {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}





