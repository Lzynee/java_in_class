/**
 *  구구단을 출력하는 프로그램
 *  ver1: 3단을 출력
 *  ver2: 원하는 단을 출력
 *  ver3: 0 또는 1을 입력하면 프로그램 종료
 * */


package com.mystudy.week2.etc;

import java.util.Scanner;

public class test100423_2 {
    public static void main(String[] args) {
        while (true) {
            // 프로그램 소개
            System.out.println("출력하려는 단을 입력하세요: (0 또는 1을 입력하면 출력 중단)");

            // 입력값 받아 오기
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            int dan = Integer.parseInt(str);

            if ((dan == 0) || (dan == 1)) break;  // 0 또는 1을 입력하면 프로그램 종료

            // 입력값이 0이 아니면 구구단을 출력하기
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%2d * %2d = %2d", dan, i, i*dan);
                System.out.println();
            }  // end of for i
        }  // end of while
    }  // end of main
}  // end of class
