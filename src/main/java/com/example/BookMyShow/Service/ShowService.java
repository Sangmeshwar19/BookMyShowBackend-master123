package com.example.BookMyShow.Service;

import com.example.BookMyShow.Repository.dto.EntryDto.ShowEntryDto;
import com.example.BookMyShow.Repository.dto.ResponseDto.ShowResponseDto;

public interface ShowService {

    ShowResponseDto addShow(ShowEntryDto showEntryDto);

    //Get show
    //Complete
    ShowResponseDto getShow(int id);
}
