package com.pb.vasyak.hw3;

import java.util.Scanner;
import java.util.Arrays;

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
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println("Ваш отсортированный массив:  " );
        System.out.println(Arrays.toString(mas));
    }
}



