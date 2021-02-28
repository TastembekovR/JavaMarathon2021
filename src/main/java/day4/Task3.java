package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr1 = new int[12][8];
        Random rand = new Random();
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr1[i].length; k++) {
                arr1[i][k] = rand.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxSumIndx = 0;
        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (int k = 0; k < arr1[i].length; k++) {
                sum += arr1[i][k];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIndx = i;
            }
        }
        System.out.println(maxSumIndx);
    }
}