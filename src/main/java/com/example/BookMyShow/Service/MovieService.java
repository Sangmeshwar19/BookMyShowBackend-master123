package com.example.BookMyShow.Service;

import com.example.BookMyShow.Repository.dto.EntryDto.MovieEntryDto;
import com.example.BookMyShow.Repository.dto.ResponseDto.MovieNameAndIdObject;
import com.example.BookMyShow.Repository.dto.ResponseDto.MovieResponseDto;

public interface MovieService {

    //Add movie
    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);


    //get movie
    MovieResponseDto getMovie(int id);

    MovieNameAndIdObject getNameAndId(int id);


}
