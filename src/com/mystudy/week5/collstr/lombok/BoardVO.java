/**
 * subjuct, content, writer를 필드로 갖는 BoardVO 클래스
 * */

package com.mystudy.week5.collstr.lombok;

import lombok.*;

@Data
@Builder
public class BoardVO {
    private String subject;
    private String content;
    private String writer;
}
