package com.study.basicCodeTest;

public class PizzaSolution  {
//    머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수
//    n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
    public static int solution(int n) {
        int answer = 0;
        int pizzaSlices = 7;
        int slicesPerPerson = 1; // 각 사람당 필요한 피자 조각 수

        int totalSlices = n * slicesPerPerson;

        answer = totalSlices / pizzaSlices;
        if (totalSlices % n != 0){
            answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println("당신의 솔루션");
        System.out.println(solution(7123));
    }
}

