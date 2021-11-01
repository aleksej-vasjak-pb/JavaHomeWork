package com.pb.vasyak.hw5;

public class Book {
    String bookTitle;
    String bookAuthor;
    String bookYear;

    public Book(String bookTitle, String bookAuthor, String bookYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public Book(String словарь, String bookAuthor) {
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public String getBookYear() {
        return bookYear;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }
    String bookInfo() {
        return "[ Автор книги: " + bookAuthor + "название: " + bookTitle + "год издания: " + bookYear + "]";
    }
}
