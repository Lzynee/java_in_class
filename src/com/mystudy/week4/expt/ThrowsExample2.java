package com.mystudy.week4.expt;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception {
        findClass();
    }  // main

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}  // class
