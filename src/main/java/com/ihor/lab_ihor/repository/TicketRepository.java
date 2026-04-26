package com.ihor.lab_ihor.repository;

import com.ihor.lab_ihor.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    List<Ticket> findByUserId(Integer userId);
}