package com.ollas.ticketing.Dao;

import com.ollas.ticketing.entities.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataAccess extends CrudRepository<Ticket, Integer> {
}
