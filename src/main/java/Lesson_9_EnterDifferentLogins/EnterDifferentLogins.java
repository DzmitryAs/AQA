package Lesson_9_EnterDifferentLogins;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnterDifferentLogins {
    /*
    5. Нужно написать программу, которая будет принимать от пользователя ввод различных логинов. Как только
    пользователь введет пустую строку - программа должна прекратить приём данных от пользователя и вывести в консоль
    логины, начинающиеся на букву f (строчную).
     */
    public static void main(String[] args) {
        List<String> logins = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter login: ");
            String login = sc.nextLine();
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }

        List<String> filteredLogins = logins.stream()
                .filter(login -> login.startsWith("f"))
                .collect(Collectors.toList());

        System.out.println("Logins starting with the letter-f: ");
        for (String log : filteredLogins) {
            System.out.println(log);
        }
    }
}

