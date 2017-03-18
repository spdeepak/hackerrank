package com.deepaksp.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/kangaroo
 * 
 * @author Deepak
 *
 */
public class Q03Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        System.out.println((v1 > v2) && (x2 - x1) % (v1 - v2) == 0 ? "YES" : "NO");
        //        String str = "NO";
        //        for (int i = x1, j = x2; i <= 10000; i++, j++) {
        //            if (j <= 10000) {
        //                x1 += v1;
        //                x2 += v2;
        //                System.out.println(x1 + "--" + x2);
        //                if (Integer.compare(x1, x2) == 0) {
        //                    str = "YES";
        //                    break;
        //                }
        //            }
        //        }
        //        System.out.println(str);
    }
}
