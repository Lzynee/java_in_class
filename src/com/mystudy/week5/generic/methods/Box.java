/**
 * 제네릭 타입인 Box 클래스 선언
 * */

package com.mystudy.week5.generic.methods;

public class Box<T> {
    // 필드
    private T t;

    // Getter 메소드
    public T get() {
        return t;
    }

    // Setter 메소드
    public void set(T t) {
        this.t = t;
    }
}
