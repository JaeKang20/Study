package com.study.basicCodeTest;


import java.util.Arrays;

public class MemoryScore{

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                for(int k = 0; k < name.length; k++){
                    if(photo[i][j].equals(name[k])) answer[i] += yearning[k];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
    MemoryScore msTest = new MemoryScore();
    String[] name = {"may","kein","kain","radi"};
    String [][] photo = {
            {"may","kein","kain","radi"},
            {"may","kein","brin","deni"},
            {"kon","kain","may","coni"}
    };
    int[] yearning = {5,10,1,3} ;
        int[] solution = msTest.solution(name, yearning, photo);

        System.out.println(Arrays.toString(solution));
    }
}
