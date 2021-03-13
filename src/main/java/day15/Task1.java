package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("src/main/resources/shoes.csv");
        File f2 = new File("src/main/resources/missing_shoes.txt");
        PrintWriter pw1 = new PrintWriter(f2);
        Scanner scanner = new Scanner(f1);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] shoes = line.split(";");
            int quantity = Integer.parseInt(shoes[2]);
            if (quantity == 0) {
                pw1.println(shoes[0] + ", " + shoes[1] + ", " + shoes[2]);
            }
        }
        pw1.close();
        scanner.close();
    }
}
