package com.springai.service;

import com.springai.dto.PoetryDto;

public interface PoetryService {

    String getCatHaiku();

    PoetryDto getPoetryByGenreAndTheme(String genre, String theme);
}