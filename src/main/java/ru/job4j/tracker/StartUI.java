package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
public class StartUI {
    public static void main(String[] args) {
        Item it = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(it.getCreated().format(formatter));
    }
}
