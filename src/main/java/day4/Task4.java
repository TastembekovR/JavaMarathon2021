package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(10000);
        }
        int max = 0;
        int indx = 0;
        for (int i = 0; i < arr1.length - 2; i++) {
            int sum;
            sum = arr1[i] + arr1[i + 1] + arr1[i + 2];
            if (sum > max) {
                max = sum;
            }
            if (max == sum) {
                indx = i;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(max);
        System.out.println(indx);
    }
}

