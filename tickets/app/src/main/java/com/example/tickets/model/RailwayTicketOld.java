package com.example.tickets.model;

public class RailwayTicketOld extends RailwayTicket {

    private float ticketDiscountOld; // скидка пенс. билет

    public  RailwayTicketOld() {
    }
    public RailwayTicketOld(float ticketPrice, int numberOfTicket, float ticketDiscountOld){
        super(ticketPrice, numberOfTicket);
        this.ticketDiscountOld = ticketDiscountOld;
    }
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscountOld)) / 100;
    }
}
