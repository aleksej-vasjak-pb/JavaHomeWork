package com.pb.vasyak.hw5;

import java.util.Arrays;

public class Reader {
    String fio;
    String ticket;
    String faculty;
    String birthday;
    String phone;

    public Reader(String fio, String ticket, String faculty, String birthday, String phone) {
        this.fio = fio;
        this.ticket = ticket;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public String getTicket() {
        return ticket;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    String getInfo() {
        return "[ ФИО : " + fio + "номер читательского билета: " + ticket + "факультет: " + faculty + "дата рождения: "
                + birthday + "телефон: " + phone + "]";
    }
    public void takeBook(int count) {
        System.out.println(fio + " взял " + count + " книги ");
    }
    public void takeBook(String... names) {
        System.out.println(fio + " взял книги: " + Arrays.toString(names).replaceAll("\\[|\\]", ""));
    }
    public void takeBook(Book... books) {
        System.out.println(fio + " взял книги: ");
        for (Book book : books) {
            System.out.println(book.getBookTitle() + book.getBookAuthor() + book.getBookYear());
        }
    }
    public void returnBook(int count) {
        System.out.println(fio + " вернул " + count + "книги ");
    }
    public void returnBook(String... names) {
        System.out.println(fio + " вернул книги: " + Arrays.toString(names).replaceAll("\\[|\\]", ""));
    }
    public void returnBook(Book... books) {
        System.out.println(fio + " вернул книги: ");
        for (Book book : books) {
            System.out.println(book.getBookTitle() + book.getBookAuthor() + book.getBookYear());
        }
    }
}
