package com.mystudy.week5.rglexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherEx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]*$");  // 영문자만
        String val = "abcdef";  // 대상문자열

        Matcher matcher = pattern.matcher(val);
        System.out.println(matcher.find());
    }
}
