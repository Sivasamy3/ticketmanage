package com.postman.ticketmanage.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TicketRepository {

    public String getStatus(String pnrNumber, String mobNo){
        if(pnrNumber.equalsIgnoreCase("pnr-123")&& mobNo.equalsIgnoreCase("9876543")){
            return "your ticket is BOOKED";
        } else if(pnrNumber.equalsIgnoreCase("pnr-456")&& mobNo.equalsIgnoreCase("9876543")){
            return "your ticket is WATING";
        } else if (pnrNumber.equalsIgnoreCase("pnr-789")&& mobNo.equalsIgnoreCase("9876543")) {
            return "your ticket is RAC";
        }
        return "Invalid";
    }
}
