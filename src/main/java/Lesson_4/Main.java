package Lesson_4;

public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("KK", "qa", "kk@gmail.com", "0123456", 4000, 21);
        persArray[1] = new Employee("RR", "ba", "rr@gmail.com", "1234567", 5000, 25);
        persArray[2] = new Employee("LL", "tm", "ll@gmail.com", "2345678", 6000, 38);
        persArray[3] = new Employee("EE", "pm", "ee@gmail.com", "3456789", 7000, 47);
        persArray[4] = new Employee("QQ", "po", "qq@gmail.com", "4567890", 8000, 50);
        for (Employee employee : persArray)
            System.out.println(employee);
    }
}
