package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(10000);
        }
        int naibolshee = 0;
        for (int b : arr1) {
            if (b > naibolshee) {
                naibolshee = b;
            }
        }
        int naimenshee = naibolshee;
        for (int b : arr1) {
            if (b < naimenshee) {
                naimenshee = b;
            }

        }
        System.out.println(naibolshee);
        System.out.println(naimenshee);

        int counter0 = 0;
        int sum = 0;
        for (int b : arr1) {
            if (b % 10 == 0) {
                counter0++;
                sum += b;
            }
        }
        System.out.println(counter0);
        System.out.println(sum);
    }
}