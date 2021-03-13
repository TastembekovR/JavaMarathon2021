package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                int age = Integer.parseInt(person[1]);
                if (age < 0) {
                    throw new IllegalArgumentException();
                } else {
                    list.add(new Person(person[0], age));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный файл");
            return null;
        }
        return list;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
