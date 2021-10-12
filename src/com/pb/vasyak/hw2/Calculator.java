package com.pb.vasyak.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println( "Введите первое целое число:" );
        Scanner scan1 = new Scanner(System.in);
        int operand1 = scan1.nextInt();
        System.out.println( "Введите второе целое число:" );
        Scanner scan2 = new Scanner(System.in);
        int operand2 = scan2.nextInt();
        System.out.println( "Введите знак арифметической операции: '+' '-' '*' '/'" );
        Scanner scan3 = new Scanner(System.in);
        int sign = scan3.nextInt();

    }
}