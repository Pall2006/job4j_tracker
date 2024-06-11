package ru.job4j;

public class Human {
    String name;
    String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name) {
        this(name, null);
    }
}

class Student extends Human {
    Student() {
        super("Petya");
    }

    public static void main(String[] args) {
        Student st = new Student();
    }

}
