package com.deepaksp.hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by
 * summing exactly four of the five integers. Then print the respective minimum and maximum values
 * as a single line of two space-separated long integers.
 * 
 * Input Format
 * 
 * A single line of five space-separated integers.
 * 
 * Constraints
 * 
 * Each integer is in the inclusive range. [1,10^9]
 * 
 * Output Format
 * 
 * Print two space-separated long integers denoting the respective minimum and maximum values that
 * can be calculated by summing exactly four of the five integers. (The output can be greater than
 * 32 bit integer.)
 * 
 * @author Deepak
 *
 */
public class Q08MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Long> list = new ArrayList();
        list.add(in.nextLong());
        list.add(in.nextLong());
        list.add(in.nextLong());
        list.add(in.nextLong());
        list.add(in.nextLong());
        Collections.sort(list);
        Long large = 0L;
        Long small = 0L;
        for (int i = 1; i < list.size(); i++) {
            large += list.get(i);
        }
        for (int i = list.size() - 2; i >= 0; i--) {
            small += list.get(i);
        }
        System.out.println(small + " " + large);
    }
}
