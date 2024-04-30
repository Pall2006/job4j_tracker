package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public void info() {
        System.out.println("Активность - " + active);
        System.out.println("Статус - " + status);
        System.out.println("Сообщение - " + message);
    }

    public static void main(String[] args) {
        Error er1 = new Error();
        Error er2 = new Error(false, 1, "Ошибки нет");
        Error er3 = new Error(true, 2, "Имеется ошибка");
        er1.info();
        er2.info();
        er3.info();
    }
}
