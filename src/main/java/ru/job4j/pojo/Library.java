package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Spring", 12);
        Book book2 = new Book("Clean code", 7);
        Book book3 = new Book("Hibernate", 3);
        Book book4 = new Book("Maven", 15);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Названик книги - " + book.getName()
                    + " Количестов штук - " + book.getCount());
        }
        Book book5 = books[0];
        books[0] = books[3];
        books[3] = book5;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Названик книги - " + book.getName()
                    + " Количестов штук - " + book.getCount());
        }
        for (int index = 0; index < books.length; index++) {
            if ("Clean code".equals(books[index].getName())) {
                System.out.println(books[index].getName());
            }
        }
    }
}
