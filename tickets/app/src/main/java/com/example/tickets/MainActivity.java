package com.example.tickets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.tickets.model.RailwayTicket;
import com.example.tickets.model.RailwayTicketChild;
import com.example.tickets.model.RailwayTicketOld;

public class MainActivity extends AppCompatActivity {

    RailwayTicket railwayTicket = new RailwayTicket(ticketPrice: 70, numberOfTickets: 9);
    RailwayTicket railwayTicketChild = new RailwayTicketChild(ticketPrice: 70, numberOfTickets: 11, ticketDiscountChild: 50);

    RailwayTicket railwayTicketOld = new RailwayTicketOld(ticketPrice: 70, numberOfTicket: 5, ticketDiscountOld: 30);

    private TextView railwayTicketTotalOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut);
        railwayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceAll() + railwayTicketChild.ticketPriceAll() + railwayTicketOld.ticketPriceAll()));

    }
}