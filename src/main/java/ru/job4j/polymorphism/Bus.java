package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Поехали");
    }

    @Override
    public void countPassengers(int passengers) {
        System.out.println("В машине - " + passengers + " пассажира");

    }

    @Override
    public double moneyRefuel(double fuel) {
        double priceForLitr = 50.5;
        return priceForLitr * fuel;
    }
}
