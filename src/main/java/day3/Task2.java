package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = a / b;
            if (b==0){
                break;
            }
            System.out.println(c);
        }
    }
}