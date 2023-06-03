package com.study.basicCodeTest;


import java.util.Scanner;



public class SwitchLowUpper {
    // 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
    // 각 알파벳을 대문자는 소문자로, 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder result = new StringBuilder();
        //String은 불변의 객체라 StringBuilder 타입을 사용.

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
