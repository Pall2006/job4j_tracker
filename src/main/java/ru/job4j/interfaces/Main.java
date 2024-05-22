package ru.job4j.interfaces;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println("________________");
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();

    }
}
