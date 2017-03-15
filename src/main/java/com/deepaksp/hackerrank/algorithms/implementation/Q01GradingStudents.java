package com.deepaksp.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Deepak
 *
 */
public class Q01GradingStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int grade = in.nextInt();
            if (grade < 38) {
                System.out.println(grade);
            } else {
                System.out.println(grade % 5 >= 3 ? grade - (grade % 5) + 5 : grade);
            }
        }
    }
}
