package ru.job4j.checkstyle;

public class Broken {
    String name;
    private int sizeOfEmpty = 10;
    private String surname;
    private static final String NEW_VALUE = "";

    public Broken() {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d) {
    }
}