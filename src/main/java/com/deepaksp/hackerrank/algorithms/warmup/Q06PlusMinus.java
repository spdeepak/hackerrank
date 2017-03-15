package com.deepaksp.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Given an array of integers, calculate which fraction of its elements are positive, which fraction
 * of its elements are negative, and which fraction of its elements are zeroes, respectively. Print
 * the decimal value of each fraction on a new line.
 * 
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal
 * places, though answers with absolute error of up to 10^-4 are acceptable.
 * 
 * Input Format
 * 
 * The first line contains an integer, N , denoting the size of the array.<br/>
 * The second line contains N space-separated integers describing an array of numbers
 * (a0,a1,a2,...,a(n-1)).
 * 
 * Output Format
 * 
 * You must print the following 3 lines:
 * 
 * 1. A decimal representing of the fraction of positive numbers in the array. <br/>
 * 2. A decimal representing of the fraction of negative numbers in the array. <br/>
 * 3. A decimal representing of the fraction of zeroes in the array.
 * 
 * @author Deepak
 *
 */
public class Q06PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println(String.format("%.6f", positive / n));
        System.out.println(String.format("%.6f", negative / n));
        System.out.println(String.format("%.6f", zero / n));
    }
}
