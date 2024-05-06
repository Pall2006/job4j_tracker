package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student st = new Student();
        st.setFio("Martianov Pavel Vitalevich");
        st.setGroup(206);
        st.setData(1997);
        System.out.println("ФИО студента - " + st.getFio());
        System.out.println("Номер группы - " + st.getGroup());
        System.out.println("Дата поступления - " + st.getData());
    }
}
