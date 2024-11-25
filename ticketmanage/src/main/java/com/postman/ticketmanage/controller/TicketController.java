package com.postman.ticketmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.postman.ticketmanage.model.UserReq;
import com.postman.ticketmanage.service.TicketService;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;
    @GetMapping("/status/{pnrNumber}")
    public String getStatus(@PathVariable("pnrNumber") String pnrNumber, @RequestParam("mob") String mobNo,@RequestParam(required = false, value = "email") String email){

        String status=ticketService.getStatus(pnrNumber,mobNo);
        return status +"for email "+email;

    }

    @PostMapping("/register")
    public String register(@RequestBody UserReq userreq){
        System.out.println(userreq);
        return userreq.getName()+" you are successfully registered ";
    }
}
