/**
 * 집을 렌트해 주는 대리점 클래스
 * Rentable의 타입 파라미터를 Home으로 대체해서 구현한다.
 * */

package com.mystudy.week5.generic.rent;

public class HomeAgency implements Rentable<Home> {  // 타입 파라미터 P를 Home으로 대체
    @Override
    public Home rent() {  // 리턴 타입이 반드시 Home이어야 함
        return new Home();
    }
}
