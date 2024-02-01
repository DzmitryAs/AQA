package Lesson_4;
/*
    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    Конструктор класса должен заполнять эти поля при создании объекта.
    Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    Создать массив из 5 сотрудников.
    Пример:
    // вначале объявляем массив объектов
    Person[] persArray = new Person[5];
    // потом для каждой ячейки массива задаем объект
    persArray[0] = new Person("Ivanov Ivan", "Engineer",
                   "ivivan@mailbox.com", "892312312", 30000, 30);
                   persArray[1] = new Person(...);
                   ...
                   persArray[4] = new Person(...);
     */
public class Employee {
    private final String name;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return ("Name: " + name + ";  Position: " + position + ";  Email: " + email + ";  Phone: " + phone + ";  Salary: " + salary + ";  Age: " + age);
    }
}

