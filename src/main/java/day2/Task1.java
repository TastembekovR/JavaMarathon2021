package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int etazh = scan.nextInt();
        if (etazh >= 1 && etazh <= 4) {
            System.out.println("Малоэтажный дом");
        }
        if (etazh >= 5 && etazh <= 8) {
            System.out.println("Среднеэтажный дом");
        }
        if (etazh >= 9) {
            System.out.println("Многоэтажный дом");
        }
        if (etazh <= 0) {
            System.out.println("Ошибка ввода");
        }
    }
}
