package com.study.basicCodeTest;

import java.util.Scanner;

public class PrintStringToColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
      for(char ch: a.toCharArray()){
          System.out.println(ch);
      }
    }
}
