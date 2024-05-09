package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int i = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                result[i++] = items[index];
            }
        }
        return Arrays.copyOf(result, i);
    }

    public boolean replace(int id, Item item) {
        if (id <= 0 || item == null) {
            return false;
        }
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            item.setId(id);

            return true;
        }
        return false;
    }

    public void delete(int id) {
        if (id <= 0) {
            return;
        }
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1,
                    items, index,
                    size - 1 - index);
            items[size - 1] = null;
            size--;
        }
    }
}