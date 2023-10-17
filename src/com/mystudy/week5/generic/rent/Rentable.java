/**
 * 인터페이스를 제네릭 타입으로 선언한다.
 * */

package com.mystudy.week5.generic.rent;

public interface Rentable<P> {  // 타입 파라미터 P 정의
    P rent();  // 타입 파라미터 P를 리턴 타입으로 사용
}
