package com.haneul.book.springboot.web.controller.dto;

import static org.assertj.core.api.Assertions.*;

import com.haneul.book.springboot.web.dto.HelloResponseDto;
import org.junit.jupiter.api.Test;

class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() throws Exception {
        // given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = HelloResponseDto.builder()
            .name(name)
            .amount(amount)
            .build();

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
