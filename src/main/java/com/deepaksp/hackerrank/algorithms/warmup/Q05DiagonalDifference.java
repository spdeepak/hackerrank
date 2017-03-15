package com.deepaksp.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Given a square matrix of size N x N, calculate the absolute difference between the sums of its
 * diagonals.
 * 
 * Input Format
 * 
 * The first line contains a single integer, N. The next N lines denote the matrix's rows, with each
 * line containing N space-separated integers describing the columns.
 * 
 * Output Format
 * 
 * Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 * 
 * @author Deepak
 *
 */
public class Q05DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int p = 0;
        int s = 0;
        for (int a_i = 0, j = n - 1; a_i < n; a_i++, j--) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
            p += a[a_i][a_i];
            s += a[a_i][j];
        }
        int diff = (p > s) ? p - s : s - p;
        System.out.println(diff);
    }
}
