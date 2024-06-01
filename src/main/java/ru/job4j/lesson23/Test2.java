package ru.job4j.lesson23;

public class Test2 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Employee empDoctor = new Doctor();
        Employee empXr = new Xirurg();
        Xirurg xirurg = new Xirurg();
        Employee empXirurg = new Xirurg();
        Employee empDriver = new Driver();
        Teacher teacher = new Teacher();
        Test2 test2 = new Test2();
        System.out.println(doctor.name);
        System.out.println(empDoctor.name);
    }
}

interface HelpAble {
    void help();
}

class Employee {
    double salary = 1000;
    String name = "Kolya";
    int age;
    int experience;

    static void eat() {
        System.out.println("Kushaet employee");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor extends Employee implements HelpAble {

    String name = "Jora";
    double salary = 1000;

    void lechit() {
        System.out.println("Lechit");
    }

    static void eat() {
        System.out.println("Kushaet Doctor");
    }

    @Override
    public void help() {
        System.out.println("The doctor treats");
    }
}

class Xirurg extends Doctor {

    String couuntOfPation;

    void operiruet() {
        System.out.println("The surgeon performs operations");
    }

    static void eat() {
        System.out.println("Kushaet Xirurg");
    }
}

class Driver extends Employee {
    String nameOfCar = "Lada";

    void drive() {
        System.out.println("Водитель водит");
    }
}

class Teacher extends Employee implements HelpAble {
    void teach() {
        System.out.println("The teacher teaches children");
    }

    @Override
    public void help() {
        System.out.println("The teacher helps helps the students");
    }
}