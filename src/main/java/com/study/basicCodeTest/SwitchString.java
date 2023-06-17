package com.study.basicCodeTest;

public class SwitchString {
    //문자들이 담겨있는 배열 arr이 주어집니다.
    //arr의 원소들을 순서대로 이어 붙인 문자열을 return하는 solution함수 작성하세요.

    public String solution(String[] arr){
        String answer = "";
   for(String a : arr){
       answer += a;
   }
        return answer;
    }
}
