package com.pb.vasyak.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите одномерный массив из 10-ти элементов");
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();
        }

        System.out.println("Ваш введенный массив:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        System.out.println("Сумма всех чисел Вашего массива: " + sum);

        int num = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                num++;
            }
        }
        System.out.println("Количество положительных элементов  =  " + num);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < mas[i - 1]); {
                    int temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                    isSorted = false;
                }
//                System.out.println(mas[i]);
            }
        }
    }
}
