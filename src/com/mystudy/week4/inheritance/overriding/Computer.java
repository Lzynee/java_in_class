package com.mystudy.week4.inheritance.overriding;

public class Computer extends Calculator{
    // method Overriding

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
