package ru.job4j.test;

public class Electrocar {
    private int id;

    public Electrocar(int id) {
        this.id = id;
    }

    public void start(int id) {
        System.out.println("Electrocar id " + id + " is starting");
    }

    private class Motor {
        public void startMotor() {
            System.out.println("Motor is starting");
        }
    }
}
