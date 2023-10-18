/**
 * ArrayList와 LinkedList의 0번 인덱스에
 * 10000개의 객체를 삽입하는데 걸린 시간을 측정한다.
 * */

package com.mystudy.week5.collstr;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        //ArrayList 컬렉션 객체 생성
        List<String> list1 = new ArrayList<String>();

        // LinkedList 컬렉션 객체 생성
        List<String> list2 = new LinkedList<String>();

        // 시작 시간과 끝 시간을 저장할 변수 선언
        long startTime;
        long endTime;

        // ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();  // 리스트를 수정하기 시작한 시각을 나노초 단위로 저장
        for (int i = 0; i<10000; i++){  // list1의 0번 인덱스에 String 객체 1만 개를 삽입
            list1.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();  // 리스트 수정이 종료된 시각
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime));  // ArrayList를 수정하는 데 걸린 시간

        // LinkedList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i<10000; i++){
            list2.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime));  // LinkedList를 수정하는 데 걸린 시간
    }
}
