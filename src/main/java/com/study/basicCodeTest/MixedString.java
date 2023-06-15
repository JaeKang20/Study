package com.study.basicCodeTest;

public class MixedString {
    //길이가 같은 두 문자열 str1과 str2가 주어집니다.

    // 두 문자열의 각  문자가 앞에서부터 서로 번갈아 가면서 한번씩 등장하는 문자열을 만들어 return 하는 solution

    public String solution(String str1, String str2){
    String answer ="";
        for (int i = 0; i < str1.length(); i++) {
          answer  += str1.substring(i, i+1) + str2.substring(i, i+1);
        }

    return answer;
    }

    public static void main(String[] args) {
        MixedString mixedString = new MixedString();

        System.out.println(mixedString.solution("aaa","bbb"));
    }

}
