package com.mystudy.week5.collstr.lombok;

import lombok.*;

@Data
@Builder
public class Board {
    private String subject;
    private String content;
    private String writer;
}
