package com.ollas.ticketing.service;

import com.ollas.ticketing.Dao.DataAccess;
import com.ollas.ticketing.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private DataAccess dataAccess;

    public Ticket createTicket(Ticket ticket) {
        return dataAccess.save(ticket);
    }

    public Ticket getTicketById(Integer ticketId){
        return dataAccess.findOne(ticketId);
    }
}
