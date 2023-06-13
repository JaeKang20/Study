package com.study.basicCodeTest;

public class StringOverWrite {

    public static String solution(String my_string, String overwrite_string, int s){
        String answer = my_string.substring(0, s)
                + overwrite_string +
                my_string.substring(s + overwrite_string.length());
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d","lloWorl",2));
    }

}
