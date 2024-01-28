public class Lesson_4 {
    public void main(String[] args) {

        Employee[] employee = new Employee[]{
                new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 50000, 41),
                new Employee("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314", 50000, 32),
                new Employee("Sidorov Sidr", "Water pot", "sidorov@mailbox.com", "892312315", 10000, 43),
                new Employee("Pupkina Nadegda", "EnvelopeLicker", "pupkina@mailbox.com", "892312316", 5000, 18),
                new Employee("Juk J", "GrinderPencil", "juk@mailbox.com", "892312317", 3000, 21)};

    }

    /*
    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    Конструктор класса должен заполнять эти поля при создании объекта.
    Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     */
    public static class Employee {

        String name;
        String position;
        String email;
        String phone;
        int salary;
        int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
            System.out.println(this);
        }



    }


}





