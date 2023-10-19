/**
 * 버튼의 클릭 이벤트를 처리하는 익명 구현 객체
 * */

package com.mystudy.week5.lambdaexpr.noparam;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        // Ok 버튼 객체에 람다식 (ClickListener 익명 구현 백체) 주입
        btnOk.setClickListener(() -> {  // 매개값으로 람다식 대입
            System.out.println("Ok 버튼을 클릭했습니다.");
        });

        // Ok 버튼 클릭하기
        btnOk.click();

        // Cancel 버튼 객체 생성
        Button brnCancel = new Button();


        // Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        brnCancel.setClickListener(() -> {
            System.out.println("Cancel 버튼을 클릭했습니다.");
        });

        // Cancel 버튼 클릭하기
        brnCancel.click();
    }
}
