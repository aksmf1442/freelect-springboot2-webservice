package com.haneul.book.springboot.web.controller;

import com.haneul.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto hello(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return HelloResponseDto.builder()
            .name(name)
            .amount(amount)
            .build();
    }
}
