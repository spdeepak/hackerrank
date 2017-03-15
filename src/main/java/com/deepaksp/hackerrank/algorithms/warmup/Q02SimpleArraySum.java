package com.deepaksp.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Given an array of integers, can you find the sum of its elements?
 * 
 * Input Format
 * 
 * The first line contains an integer, N, denoting the size of the array.<br/>
 * The second line contains B space-separated integers representing the array's elements.
 * 
 * Output Format
 * 
 * Print the sum of the array's elements as a single integer.
 * 
 * @author Deepak
 *
 */
public class Q02SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int arr_i = 0; arr_i < n; arr_i++) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}
