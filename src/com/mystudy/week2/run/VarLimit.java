/**
 * @author Lzyne
 * 유효 범위 확인하기
 * 작성일: 2023-09-22
 */


package com.mystudy.week2.run;

public class VarLimit {
    public static void main(String[] args) {

        // 변수 선언
        byte i = 127;
        byte j = 4;
        byte sum;

        sum = (byte) (i + j);  // 강제 형변환 (캐스트 연산자, cast operator)

        System.out.println("i + j ="+ sum);
        System.out.println(i + "+" + j + "=" + sum);
    }
}

