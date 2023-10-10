package com.mystudy.myclass.example01;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
//    public Korean(String n, String s) {
//        name = n;  // 매개값으로 이름을 받는다.
//        ssn = s;  // 매개값으로 주민등록번호를 받는다.
//   }

    public Korean(String name, String ssn) {
        this.name = name;  // 매개값으로 이름을 받는다.
        this.ssn = ssn;  // 매개값으로 주민등록번호를 받는다.
    }
}
