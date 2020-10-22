package ru.geekbrains.homework5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Паровозов Аркадий", "Герой", "superhero1@heroes.ru", "+79998887766", 15000, 35);

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Машинный Григорий", "Автомеханик", "g.mashinny@auto.ru", "+79998887766", 45000, 43);
        employeeArray[1] = new Employee("Лютик Петр", "Садовод", "lutik@garden.ru", "+79887371515", 35000, 45);
        employeeArray[2] = new Employee("Цветкова Анна", "Бухгалтер", "a.cvetkova@business.ru", "+79557551515", 55000, 41);
        employeeArray[3] = new Employee("Замысловатов Андрей", "Художник", "zamyslovatov@picture.ru", "+79003000100", 11000, 35);
        employeeArray[4] = new Employee("Песочная Екатерина", "Архитектор", "ekaterina@houses.ru", "+79005553555", 45000, 28);

        for (Employee emp : employeeArray) {
            if(emp.getAge()>=40) {
                emp.aboutEmployee();
            }
        }
    }
}
