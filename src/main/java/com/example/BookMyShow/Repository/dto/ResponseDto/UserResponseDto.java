package com.example.BookMyShow.Repository.dto.ResponseDto;

import com.example.BookMyShow.Repository.dto.TicketDto;
import lombok.*;

import java.util.List;

@Data
@Builder
public class UserResponseDto {

    int id;

    String name;

    String mobNo;

    //Optional
    List<TicketDto> tickets;
}
