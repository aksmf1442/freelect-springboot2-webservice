package com.haneul.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
