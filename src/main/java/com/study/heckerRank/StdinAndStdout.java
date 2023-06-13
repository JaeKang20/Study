package com.study.heckerRank;

import org.springframework.expression.ParserContext;

import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class StdinAndStdout {//standard input and standard output
//Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).
//One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

    //Scanner scanner = new Scanner(System.in);
//String myString = scanner.next();
//int myInt = scanner.nextInt();
//scanner.close();
//System.out.println("myString is: " + myString);
//System.out.println("myInt is: " + myInt);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();

    }


}