package com.deepaksp.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * You are given an array of integers of size N. You need to print the sum of the elements in the
 * array, keeping in mind that some of those integers may be quite large.
 * 
 * Input Format
 * 
 * The first line of the input consists of an integer N. The next line contains N space-separated
 * integers contained in the array.
 * 
 * Output Format
 * 
 * Print a single value equal to the sum of the elements in the array.
 * 
 * @author Deepak
 *
 */
public class Q04AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Long l = 0L;
        for (int arr_i = 0; arr_i < n; arr_i++) {
            l += in.nextLong();
        }
        System.out.println(l);
    }
}
