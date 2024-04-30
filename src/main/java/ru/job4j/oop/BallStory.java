package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ben = new Ball();
        Hare jone = new Hare();
        Wolf stive = new Wolf();
        Fox mila = new Fox();
        jone.tryEat(ben);
        stive.tryEat(ben);
        mila.tryEat(ben);
    }
}
