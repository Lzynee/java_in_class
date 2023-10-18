/**
 * ArrayList에 객체를 추가, 검색, 삭제하는 방법 연습
 * Board에 제목, 내용, 글쓴이 객체를 추가한다.
 * */

package com.mystudy.week5.collstr.lombok;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<BoardVO> list = new ArrayList<>();

        // BoardVO 리스트에 제목, 내용, 글쓴이 객체를 추가한다.
        for (int i = 1; i <= 5; i++) {  // "제목 1", "내용 1", "글쓴이 1" 형식의 객체를 5개 추가
            String title = "제목 " + i;
            String content = "내용 " + i;
            String author = "글쓴이 " + i;

            list.add(new BoardVO(title, content, author));
        }

        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        // 특정 인덱스의 객체 가져오기
        BoardVO boardVO = list.get(2);  // "제목/내용/글쓴이 3" 항목을 가져온다.
        System.out.println(boardVO.getSubject() + "\t" + boardVO.getContent() + "\t" + boardVO.getWriter());
        System.out.println();

        // 모든 객체를 하나씩 가져오기
        for (int i=0; i<list.size(); i++) {
            BoardVO b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        // 객체 삭제
        list.remove(2);
        list.remove(2);

        // 향상된 for 문으로 모든 객체를 하나씩 가져오기
        for (BoardVO b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}
