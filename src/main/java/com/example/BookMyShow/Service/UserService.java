package com.example.BookMyShow.Service;

import com.example.BookMyShow.Repository.dto.EntryDto.UserEntryDto;
import com.example.BookMyShow.Repository.dto.ResponseDto.UserResponseDto;

public interface UserService { //Designing part

    void addUser(UserEntryDto userEntryDto);

    UserResponseDto getUser(int id);


}
