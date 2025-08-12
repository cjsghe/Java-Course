package com.qa;

//import java.awt.print.Book;

public class TestBooks {
    public static void main(String[] args) {
        Book book1 = new Book ("Harry Potter 1", "JK Rowling", 10);
        Book book2 = new Book ("Harry Potter 2", "JK Rowling", 20);
        Book book3 = new Book ("Harry Potter 3", "JK Rowling", 30);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        Book[] bookArray = new Book[3];

        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;

        for (int i = 0; i < bookArray.length; i++){
            System.out.println(bookArray[i]);
        }
    }
}
