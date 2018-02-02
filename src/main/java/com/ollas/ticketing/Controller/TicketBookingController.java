package com.ollas.ticketing.Controller;

import com.ollas.ticketing.entities.Ticket;
import com.ollas.ticketing.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping(value = "create")
    public Ticket createTicket (Ticket ticket){
        return  bookingService.createTicket(ticket);

    }
    @GetMapping(value = "/ticket/{ticketId}")
    public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId){
        return bookingService.getTicketById(ticketId);

    }
    @GetMapping(value = "/ticket/alltickets")
    public Iterable<Ticket> getAllBookedTickets(){
        return bookingService.getAllBookedTickets();
    }
    @DeleteMapping(value = "/ticket/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId") Integer ticketId){
        bookingService.deleteTicket(ticketId);
    }

}
