package ru.job4j.test;

import java.util.Objects;

public class Test1 {

    String name;
    String surname;
    int course;

    public Test1(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Test1{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", course=" + course
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Test1 test1 = (Test1) o;
        return course == test1.course && Objects.equals(name, test1.name) && Objects.equals(surname, test1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}