public class Lesson_4 {
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
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("KK", "qa", "kk@gmail.com", "0123456", 4000, 21);
        persArray[1] = new Employee("RR", "ba", "rr@gmail.com", "1234567", 5000, 25);
        persArray[2] = new Employee("LL", "tm", "ll@gmail.com", "2345678", 6000, 38);
        persArray[3] = new Employee("EE", "pm", "ee@gmail.com", "3456789", 7000, 47);
        persArray[4] = new Employee("QQ", "po", "qq@gmail.com", "4567890", 8000, 50);
        for (Employee imployee : persArray)
            System.out.println(imployee);
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

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


/*
Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
 */
class Park {
    public static void main(String[] args) {
        Park park = new Park();
        Park.Attraction attraction1 = park.new Attraction();

        attraction1.attractionName = "The Sun";
        attraction1.workingHours = "12:00 - 24:00";
        attraction1.cost = "10";
        attraction1.getAttrInfo();
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private String cost;

        public void getAttrInfo() {
            System.out.println("Attraction Name: " + attractionName + ";  Working Hours: " + workingHours + ";  Cost :" + cost);
        }
    }
}



