package com.pb.vasyak.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println( "Введите первое целое число:" );
        Scanner scan = new Scanner(System.in);
        int operand1 = scan.nextInt();
        System.out.println( "Введите второе целое число:" );
        int operand2 = scan.nextInt();
        System.out.println( "Введите знак арифметической операции: '+' '-' '*' '/'" );
        String sign = scan.next();
        switch (sign){
            case "+": System.out.println(operand1 + operand2);
                break;
            case "-": System.out.println(operand1 - operand2);
                break;
            case "*": System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 !=0)
                    System.out.println(operand1 / operand2);
                else
                    System.out.println("Деление на '0' запрещенно!");
        }
    }
}

