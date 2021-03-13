package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String[] numbers = scanner.nextLine().split(" ");
        double sum = 0;
        double srArif = 0;
        for (String x : numbers) {
            srArif = (sum += Integer.parseInt(x)) / numbers.length;
        }
        System.out.println(srArif);
        String formatDouble = new DecimalFormat("#0.000").format(srArif);
        System.out.println(formatDouble);
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("lesson14");
        printResult(f1);
    }
}

