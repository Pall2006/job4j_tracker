package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public double divide(int y) {
        return (double) y / x;
    }

    public double sumAllOperation(int y) {
        return (sum(y) + multiply(y) + minus(y) + divide(y));
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result1 = sum(10);
        int result2 = minus(10);
        int result3 = calc.multiply(20);
        double result4 = calc.divide(8);
        double result5 = calc.sumAllOperation(32);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
