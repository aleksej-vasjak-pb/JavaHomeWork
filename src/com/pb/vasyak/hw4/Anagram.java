package com.pb.vasyak.hw4;

import java.util.Arrays;
import java.util.Scanner; //Вызываем для дальнейшего использования класса Scanner

public class Anagram {
    //Создаем метод для ввода текста пользователем
    private static String Text(int Anagram) {
        switch (Anagram){
            case (0): System.out.println("Введите первую строку: ");
            break;
            case (1): System.out.println("Введите вторую строку");
            break;
        }
        Scanner input = new Scanner(System.in);
        String userPhrase = input.nextLine().toUpperCase();
        return userPhrase;
    }
    //Создаем метод для упорядочивания элементов массивов по алфавиту и сравнения их элементов
    private static String checkArrays(String firstText, String secondText) {
        String Message = " ";
        char[] firstTextChars = firstText.toCharArray();
        char[] secondTextChars = secondText.toCharArray();
        Arrays.sort(firstTextChars);
        Arrays.sort(secondTextChars);
        if(Arrays.equals(firstTextChars,secondTextChars) == true){
            Message = Message+"Строки являются анаграмами";
        }
        else {
            Message = Message+"Строки не являются анаграмами";
        }
        return Message;
    }
    //Создаем метод для сравнения строк на признак анаграмности
    private static void Anagrams(String firstText, String secondText){
        String Message = " ";
        if (firstText.equals(secondText)){
            Message = Message+"Введены одинаковые строки!";
        }
        else {
            firstText = firstText.replaceAll("[ ,.?!:;-]","");
            secondText = secondText.replaceAll("[ ,.?!:;-]","");
            Message = Message+checkArrays(firstText, secondText);
        }
        System.out.println(Message);
    }

    public static void main(String[] args) {
        System.out.println("Проверяем строки на анаграмность!");
        String firstTextEnd = Text(0);
        String secondTextEnd = Text(1);
        Anagrams(firstTextEnd,secondTextEnd);
    }

}
