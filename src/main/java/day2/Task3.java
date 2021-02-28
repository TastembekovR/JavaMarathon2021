package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a + 1;
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        while (c < b) {
            if (c % 5 == 0 && !(c % 10 == 0)) {
                System.out.print(c + " ");
            }
            c++;
        }
    }
}
