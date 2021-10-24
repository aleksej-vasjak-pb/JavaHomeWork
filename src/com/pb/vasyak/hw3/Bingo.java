package com.pb.vasyak.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int UnknownNumber, UserNumber, TrysCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 100");
        System.out.println("Для выхода из игры введите: 111");
        UnknownNumber = (int)Math.floor(Math.random() * 100);
        do {
            TrysCount++;
            System.out.print("Введите Ваше число: ");
            UserNumber = input.nextInt();
            if (UserNumber == 111) {
                break;
            }
            else if (UserNumber > UnknownNumber) System.out.println("Загаданное число меньше введёного!");
            else if (UserNumber < UnknownNumber) System.out.println("Загаданное число больше введёного!");
            else System.out.println("Ура!!! Число отгадано!");
        } while (UserNumber != UnknownNumber);
        System.out.println("Ваше количество попыток: " + TrysCount);
    }
}
