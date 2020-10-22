package ru.geekbrains.homework5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void aboutEmployee() {

        System.out.println(
                "Имя:" + name + "\n" +
                "Возраст: " + age + "\n" +
                "Должность: " + position + "\n" +
                "E-mail: " + email + "\n" +
                "Телефон: " + phone + "\n" +
                "Зарплата: " + salary + "\n"
        );
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
