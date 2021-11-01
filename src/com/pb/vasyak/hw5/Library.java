package com.pb.vasyak.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Приключения ", "Иванов И. И.", "2000 г.");
        Book book2 = new Book("Словарь ", "Сидоров А. В.", "1980 г.");
        Book book3 = new Book("Энциклопедия ", "Гусев К. В.", "2010 г.");

        Reader reader1 = new Reader("Петров В. В.", "1234 ", "ФИКТ ", "01.02.1989 ", "0674230953" );
        Reader reader2 = new Reader("Киляев П.Ж.", "2345 ", "ФЭМ ", "03.12.1992 ", "0973445623");
        Reader reader3 = new Reader("Гамов Е.П.", "4532 ", "ФИМ ", "23.03.1992 ", "0502346312");

        System.out.println("База книг: ");
        System.out.println(book1.bookInfo() + "\n" + book2.bookInfo() + "\n" + book3.bookInfo());
        System.out.println("Список пользователей библиотеки: ");
        System.out.println(reader1.getInfo() + "\n" + reader2.getInfo() + "\n" + reader3.getInfo());

        reader1.takeBook(3);
        reader2.takeBook(book1, book2, book3);
        reader3.takeBook(book1.bookTitle, book2.bookTitle, book3.bookTitle);

        reader1.returnBook(3);
        reader2.returnBook(book1, book2, book3);
        reader3.returnBook(book1.bookTitle, book2.bookTitle,book3.bookTitle);

    }
}
