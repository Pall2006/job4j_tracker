package ru.job4j.lesson23;

public class Test2 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Employee dy = new Doctor();
        System.out.println(dy.name);
        Employee xr = new Xirurg();
        Xirurg xirurg = new Xirurg();
        Doctor xirurg2 = new Xirurg();
        xr.eat();
        xirurg2.sleep();
        System.out.println(xr.name);
    }
}

class Employee {

    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushaet");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor extends Employee {

    String name = "Jora";
    
    void lechit() {
        System.out.println("Lechit");
    }

    void eat() {
        System.out.println("Kushaet Doctor");
    }
}

class Xirurg extends Doctor {

    String nameCar;

    void eat() {
        System.out.println("Kushaet Xirurg");
    }
}