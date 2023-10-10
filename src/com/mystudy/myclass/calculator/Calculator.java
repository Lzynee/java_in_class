package com.mystudy.myclass.calculator;

public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }  // void

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    int plus(int x, int y) {
        return x + y;
    }

    double divide(int x, int y) {
        return (double) x / (double) y;
    }

    int minus(int x, int y) {
        return x - y;
    }

    int multiply(int x, int y) {
        return x * y;
    }
}  // class
