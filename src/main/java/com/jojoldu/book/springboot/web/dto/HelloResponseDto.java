package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
//final필드 포함된 생성자 생성, final 없음녀 생성자에 포함되지 않음.
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
