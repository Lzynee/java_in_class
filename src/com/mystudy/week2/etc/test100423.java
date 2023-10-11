/**
 * 자연수 1~10의 합을 구하는 프로그램
 * */

package com.mystudy.week2.etc;

public class test100423 {
    public static void main(String[] args) {
        int sum = 0;  // 숫자들의 합을 저장할 변수

        for (int i = 1; i <= 10; i++) {  //  안에 들어가는 내용이 한 줄이므로, 중괄호 생략 가능
            sum += i;
        }

        System.out.println("1 ~ 10까지의 합: "+sum);
    }
}
