package ru.job4j.pojo;

public class Shop {
    /**
     * Поиск первого null элемента в массиве продуктов.
     * @param products массив продуктов
     * @return индекс первого null элемента, или -1 если null элемент не найден
     */
    public static int indexOfNull(Product[] products) {
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                return index;
            }
        }
        return -1;
    }
}





