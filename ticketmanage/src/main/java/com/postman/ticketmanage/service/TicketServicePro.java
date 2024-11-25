package com.postman.ticketmanage.service;

import com.postman.ticketmanage.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServicePro implements TicketService {
    @Autowired
    TicketRepository ticketRepository;
    @Override
    public String getStatus(String pnrNumber, String mobNo) {
        return ticketRepository.getStatus(pnrNumber,mobNo);
    }
}
