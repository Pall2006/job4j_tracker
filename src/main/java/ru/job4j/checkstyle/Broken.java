package ru.job4j.checkstyle;

public class Broken {
    String name;
    private int sizeOfEmpty = 10;
    public String surname;
    public static final String NEW_VALUE = "";

    Broken() {
    }

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d) {
    }
}