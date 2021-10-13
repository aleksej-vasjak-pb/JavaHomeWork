package com.pb.vasyak.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println( "Введите пожалуйста целое число:" );
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number >= 0 & number <= 14) {
            System.out.println("Ваше число входит в промежуток от 0 до 14");
        }
        else if (number >= 15 & number <= 35) {
            System.out.println("Ваше число входит в промежуток от 15 до 35");
        }
        else if (number >= 36 & number <= 50) {
            System.out.println("Ваше число входит в промежуток от 36 до 50");
        }
        else if (number >= 51 & number <= 100) {
            System.out.println("Ваше число входит в промежуток от 51 до 100");
        }
        else {
            System.out.println("Введенное число не попадает ни в один из имеющихся промежутков");
        }
    }
}


