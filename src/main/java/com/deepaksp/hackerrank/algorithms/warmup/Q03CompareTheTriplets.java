package com.deepaksp.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges,
 * awarding points on a scale from to 1 to 100 for three categories: problem clarity, originality,
 * and difficulty.
 * 
 * We define the rating for Alice's challenge to be the triplet A= (a0,a1,a2), and the rating for
 * Bob's challenge to be the triplet B = (b0,b1,b2).
 * 
 * Your task is to find their comparison points by comparing a0 with b0, a1 with b1, and a2 with b2.
 * 
 * If , ai > bi then Alice is awarded point.<br/>
 * If , ai < bi then Bob is awarded point.<br/>
 * If , ai = bi then neither person receives a point. <br/>
 * 
 * Comparison points is the total points a person earned.
 * 
 * Given A and B, can you compare the two challenges and print their respective comparison points?
 * 
 * Input Format
 * 
 * The first line 3 contains space-separated integers, a0, a1, and a2, describing the respective
 * values in triplet A. The second line contains space-separated integers, b0, b1, and b2,
 * describing the respective values in triplet B.
 * 
 * Constraints
 * 
 * 1 <= ai <= 100<br/>
 * 1 <= bi <= 100
 * 
 * Output Format
 * 
 * Print two space-separated integers denoting the respective comparison points earned by Alice and
 * Bob.
 * 
 * @author Deepak
 *
 */
public class Q03CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] a = { a0, a1, a2 };
        int[] b = { b0, b1, b2 };
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                alice++;
            } else if (a[i] < b[i]) {
                bob++;
            }
        }
        System.out.println(alice + " " + bob);
    }
}
