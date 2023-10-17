/**
 * 차를 렌트해 주는 대리점 클래스
 * Rentable의 타입 파라미터를 Car로 대체해서 구현한다.
 * */

package com.mystudy.week5.generic.rent;

public class CarAgency implements Rentable<Car> {  // 타입 파라미터 P를 Car로 대체
    @Override
    public Car rent() {
        return new Car();
    }  // 리턴 타입이 반드시 Car여야 함
}
