package com.ollas.ticketing;

import com.ollas.ticketing.entities.Ticket;
import com.ollas.ticketing.service.BookingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

@SpringBootApplication
public class TicketingApplication {

	public static void main(String[] args) {
	    ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketingApplication.class, args);

        BookingService bookingService = applicationContext.getBean("bookingService", BookingService.class);
        Ticket ticket = new Ticket();
        ticket.setBookingDate(new Date());
        ticket.setArrival("Lagos");
        ticket.setDeparture("Jos");
        ticket.setPassengerName("John");
        ticket.setEmail("marshall@yahoo.com");

        bookingService.createTicket(ticket);

	}
}
