package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(f1);
        Random rand1 = new Random();
        for (int i = 0; i < 1000; i++) {
            pw1.println(rand1.nextInt(100));
        }
        pw1.close();

        System.out.println();

        File f2 = new File("file2.txt");
        Scanner scanner = new Scanner(f1);
        PrintWriter pw2 = new PrintWriter(f2);
        int counter = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;
            if (counter == 20) {
                pw2.println(sum / 20.0);
                counter = 0;
                sum = 0;
            }
        }
        pw2.close();
        printResult(f2);
    }

    static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        while (scanner.hasNextLine()) {
            sum += Double.parseDouble(scanner.nextLine());
        }
        int result = (int) sum;
        System.out.println(result);
    }
}
