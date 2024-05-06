package ru.job4j;

public class Chelovek {
    final String pol;
    private String name;
    private int age;
    private int ves;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        if (ves > 2 && ves < 250) {
            this.ves = ves;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek chel = new Chelovek("male");
        chel.setAge(15);
        chel.setName("Vovan");
        chel.setVes(54);
    }
}

