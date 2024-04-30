package ru.job4j.oop;

public class Ball {

    @SuppressWarnings("checkstyle:SimplifyBooleanExpression")
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("The Ball was eaten");
        } else {
            System.out.println("The Ball ran");
        }
    }
}
