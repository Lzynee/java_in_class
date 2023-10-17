/**
 * HomeAgency와 CarAgency에서 대여한
 * Home과 Car를 이용한다.
 * */

package com.mystudy.week5.generic.rent;

public class GenericRent {
    public static void main(String[] args) {
        // 생성자 선언 및 메소드 호출
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();  // '전등을 켭니다.'

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();  // '자동차가 달립니다.'
    }
}
