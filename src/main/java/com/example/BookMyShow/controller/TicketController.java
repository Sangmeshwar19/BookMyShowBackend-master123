package com.example.BookMyShow.controller;

import com.example.BookMyShow.Service.impl.TicketServiceImpl;
import com.example.BookMyShow.Repository.dto.BookTicketRequestDto;
import com.example.BookMyShow.Repository.dto.ResponseDto.TicketResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    TicketServiceImpl ticketService;

    @GetMapping("/get-ticket/{id}")
    public TicketResponseDto getTicketById(@PathVariable Integer id){

        return ticketService.getTicket(id);
    }

    @PostMapping("/add")
    public TicketResponseDto addTicket(@RequestBody() BookTicketRequestDto bookTicketRequestDto){


        return ticketService.bookTicket(bookTicketRequestDto);

    }
}

