package com.example.tickets.model;

public class RailwayTicketChild extends RailwayTicket {

    private float ticketDiscountChild; // скидка дет. билет

    public RailwayTicketChild() {
    }

    public RailwayTicketChild(float ticketPrice, int numberOfTicket, float ticketDiscountChild) {
        super(ticketPrice, numberOfTicket);
        this.ticketDiscountChild = ticketDiscountChild;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscountChild))/100;
    }
}
