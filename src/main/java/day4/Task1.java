package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int[] arr1 = new int[i];
        Random rand = new Random();
        int counter8 = 0;
        int counter1 = 0;
        int counterChetn = 0;
        int counterNeChetn = 0;
        int sum = 0;
        for (int a = 0; a < arr1.length; a++) {
            arr1[a] = rand.nextInt(10);
            if (arr1[a] > 8) {
                counter8++;
            }
            if (arr1[a] == 1) {
                counter1++;
            }
            if (arr1[a] % 2 == 0) {
                counterChetn++;
            } else {
                counterNeChetn++;
            }
            sum += arr1[a];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        System.out.println("Длина массива: " + arr1.length);
        System.out.println("Количество чисел больше 8:" + counter8);
        System.out.println("Количество чисел равных 1: " + counter1);
        System.out.println("Количество четных чисел: " + counterChetn);
        System.out.println("Количество нечетных чисел: " + counterNeChetn);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
