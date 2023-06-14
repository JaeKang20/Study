package com.study.basicCodeTest;


import java.util.Arrays;
import java.util.Stack;

public class GraterThenMe {
    public int[] solution(int[] numbers) {
        //정수로 이루어진 배열 numbers가 있습니다. 배열 의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수를 뒷 큰수라고 합니다.
        //정수 배열 numbers가 매개변수로 주어질 때, 모든 원소에 대한 뒷 큰수들을 차례로 담은 배열을 return 하도록 solution 함수를 완성해주세요. 단, 뒷 큰수가 존재하지 않는 원소는 -1을 담습니다.
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1); //코드안에 내용을 -1로 초기화.
        Stack<Integer> s = new Stack<>(); //LIFO 자료구조.
        s.push(0);
        for(int i = 1; i < numbers.length; i++){
            while(!s.isEmpty()){//스택이 비어있지 않은 동안 반복
                int idx = s.pop(); //스택에서 인덱스를 pop
                if(numbers[i] > numbers[idx]){ //idx보다 뒤에 숫자가 더 클때
                    answer[idx] = numbers[i];
                } else { // 앞이 더 크거나 같을 때
                    s.push(idx);
                    break;
                }
            }
            s.push(i);
        }

        return answer;
    }
}

