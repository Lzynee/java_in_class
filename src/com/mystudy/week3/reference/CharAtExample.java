package com.mystudy.week3.reference;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1':
            case '3':
                System.out.printf("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.printf("여자입니다.");
                break;
        }  // end of switch
    }
}
