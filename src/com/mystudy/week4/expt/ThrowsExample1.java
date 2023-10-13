package com.mystudy.week4.expt;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        }catch (ClassNotFoundException e) {
            System.out.println("예외 처리: " + e.toString());
        }
    }  // main

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }  // findClass()
}  // class
