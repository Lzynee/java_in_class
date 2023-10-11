package com.mystudy.week4.polymorphism.parameter;

public class Taxi extends Vehicle{
    // 메소드 재정의

    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
