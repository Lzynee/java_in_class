package com.mystudy.week4.polymorphism.field;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();

        // HanKookTire 객체 장착
        myCar.tire = new HankookTire();
        myCar.run();

        // KumhoTire 객체 장착
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
