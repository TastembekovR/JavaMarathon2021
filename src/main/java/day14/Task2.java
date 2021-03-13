package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] person = line.split(" ");

                int age = Integer.parseInt(person[1]);

                if (age < 0) {
                    throw new IllegalArgumentException();
                }
                people.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный файл");
            return null;
        }
        return people;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("people");
        System.out.println(parseFileToStringList(f1));
    }
}
