package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                result = index;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("There is no such element in the array");
        }
        return result;
    }

    public static void main(String[] args) {
        int result = 0;
        try {
           result = indexOf(new String[]{"Summer", "Autumn", "Winter", "Spring"}, "Wonter");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
