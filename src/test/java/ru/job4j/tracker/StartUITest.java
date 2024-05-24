package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StartUITest {

    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void whenAddMultipleItems() {
        String[] answers = {"Fix PC", "Fix Car"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        Item created1 = tracker.findAll()[0];
        Item created2 = tracker.findAll()[1];
        Item expected1 = new Item("Fix PC");
        Item expected2 = new Item("Fix Car");
        assertThat(created1.getName()).isEqualTo(expected1.getName());
        assertThat(created2.getName()).isEqualTo(expected2.getName());
    }
}