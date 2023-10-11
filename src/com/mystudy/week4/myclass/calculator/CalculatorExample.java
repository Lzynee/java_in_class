/**
* 가감승제 계산 프로그램
 * 연산기호와 두 정수값을
 * (연산기호 값1 값2) 형식으로 입력 받아 연산한 후,
 * 결과를 출력한다.
* */

package com.mystudy.week4.myclass.calculator;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        com.mystudy.week4.myclass.calculator.Calculator myCalc = new Calculator();

        myCalc.powerOn();
        System.out.println();

        // 연산할 부호와 숫자 두 개를 한꺼번에 입력 받는다.
        System.out.print("연산할 부호와 정수값 두 개를 입력하세요. (각 요소는 띄어쓰기 1개로 구분할 것) >");
        Scanner sc1 = new Scanner(System.in);
        String mark = sc1.nextLine();

        // 입력값을 연산기호와 숫자로 나누어 저장한다.
        String[] calc = mark.split(" ");
        String operation = calc[0];  // 연산기호를 저장
        int x = Integer.parseInt(calc[1]);  // 입력 받은 정수값1을 변수 x에 저장
        int y = Integer.parseInt(calc[2]);  // 입력 받은 정수값2를 변수 y에 저장

        // 입력 받은 부호와 값을 계산하여 결과를 출력한다.
        if (operation.equals("/")) {  // 나눗셈의 연산 결과는 double 형식으로 변환하여 출력한다.
            double result = myCalc.divide(x, y);
            System.out.printf("%d %s %d = %.2f%n%n", x, operation, y, result);
        } else {  // 나눗셈이 아닌 경우 int 형식으로 된 결과를 출력한다.
            int result = 0;

            if (operation.equals("+")) {  // 덧셈 연산
                result = myCalc.plus(x, y);
            } else if ("-".equals(operation)) {  // 뺄셈 연산
                result = myCalc.minus(x, y);
            } else if ("*".equals(operation)) {  // 곱셈 연산
                result = myCalc.multiply(x, y);
            }

            System.out.printf("%d %s %d = %d%n%n", x, operation, y, result);
        }

        myCalc.powerOff();
    }
}
