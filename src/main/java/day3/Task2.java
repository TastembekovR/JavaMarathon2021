package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        while (b != 0) {
            double c = a / b;
            System.out.println(c);
            a = scan.nextDouble();
            b = scan.nextDouble();
        }
    }
}
