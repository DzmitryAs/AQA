package Lesson_9_AverageAgeOfMaleStudents;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson_9_AverageAgeOfMaleStudents {
    /*
    4. Создай класс со следующим содержимым: (СМ. СКРИНШОТ)
    4.1. Необходимо узнать средний возраст студентов мужского пола;
    4.2. Кому из студентов грозит получение повестки в этом году при условии, что призывной возраст установлен в
    диапазоне от 18 до 27 лет.
     */
    public static void main(String[] args) {
        testFilterAndCount();
    }

    private static void testFilterAndCount() {
        Collection<Student> people = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        // Выбрать студентов-военообязанных
        List<Student> militaryService = people.stream().filter((p) -> p.getAge() >= 18 && p.getAge() < 27
                && p.getGender() == Gender.MAN).collect(Collectors.toList());
        System.out.println("militaryService = " + militaryService);

        // Найти средний возраст студентов мужского пола
        double manAverageAge = people.stream().filter((p) -> p.getGender() == Gender.MAN).
                mapToInt(Student::getAge).average().getAsDouble();
        System.out.println("manAverageAge = " + manAverageAge);
    }

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }
}

