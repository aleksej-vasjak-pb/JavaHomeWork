package com.pb.vasyak.hw4;

import java.util.Scanner; //Вызываем для дальнейшего использования класса Scanner

public class CapitalLetter {

    static char[] Mass (String Phrase) {  //Создаем символьный массив Mass из строки Phrase
        return Phrase.toCharArray(); //Возвращаем преобразованную строку Phrase в массив с помощью метода toCharArray()
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Создаем новый обьект класса Scanner в переменной input
        System.out.println("Введите фразу для преобразования первой буквы в верхний регистр: ");//Предлагаем юзеру ввести строку данных
        String userPhrase = input.nextLine(); //Создаем переменную userPhrase в которую загоняем то, что ввел юзер через input
        char[] userPhraseMass = Mass(userPhrase); //Создаем массив символов userPhraseMass из строки userPhrase с помощью метода Mass
        userPhraseMass[0] = Character.toUpperCase(userPhraseMass[0]);//Делаем первую букву заглавной с помощью метода toUpperCase
        for (int i = 0; i < userPhraseMass.length; i++) { //Перебираем всю длину массива userPhraseMass
            if (userPhraseMass[i] == ' ') { // если встречаем пробел то делаем операцию ниже
                userPhraseMass[i + 1] = Character.toUpperCase(userPhraseMass[i + 1]); //перешагиваем на 1 символ
            }
        }
        System.out.println(userPhraseMass); //Выводим новый результат

    }
}
