package com.study.programers.level1;


import java.util.Arrays;
import java.util.List;

import static java.util.List.*;


public class DoOver {
    //어느 학교에 페인트 칠해진 길이가 n미터인 벽이 있다.
    //페인트를 덧칠할 것입니다.
    //구역을 나누어 칠할겁니다. 벽미터 길이를 n개로 나누고
    //순서대로 1번부터 n번까지 번호를 붙입니다. 롤러의 길이는 m미터이고 한번 칠하는 규칙은 다음과 같아요.

    /*
    롤러가 벽에서 벗어나면 안된다.
    구역의 이룹분만 포함되도록 칠하면 안된다.
    */

    //칠하기로 정한 구역은 적어도 한 번 페인트 칠합니다. (최소화)

    //정수 n과 m이, 구역 배열 section과 인자로 주어진다면 롤러로 페인트칠해야 하는
    //최소 횟수를 return하세요.

        public int solution(int n, int m, int[] section) {
            int maxPainted = 0, cntPaint = 0;
            for (int point : section) {
                if (maxPainted <= point) {
                    maxPainted = point + m;
                    cntPaint++;
                }
            }
            return cntPaint;
        }
    }
