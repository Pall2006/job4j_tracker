package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
public class StartUI {
    public static void main(String[] args) {
        Item it = new Item(5, "Подготовить отчет");
        System.out.println(it);
    }
}
