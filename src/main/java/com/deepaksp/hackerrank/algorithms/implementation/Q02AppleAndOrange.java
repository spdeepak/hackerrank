package com.deepaksp.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange <br/>
 * Test cases 3,5,6,9,10,11 are timing out Needs improvement
 * 
 * @author Deepak
 */
public class Q02AppleAndOrange {

    public Q02AppleAndOrange() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s_houseLeftPoint = in.nextInt();
        int t_houseRightPoint = in.nextInt();
        int a_AppleTreePoint = in.nextInt();
        int b_OrangeTreePoint = in.nextInt();
        int totalApples = in.nextInt();
        int totalOranges = in.nextInt();
        int[] apple = new int[totalApples];
        for (int apple_i = 0; apple_i < totalApples; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[totalOranges];
        for (int orange_i = 0; orange_i < totalOranges; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        String[] houseRange = Arrays.toString(IntStream.range(s_houseLeftPoint, t_houseRightPoint + 1)
                .toArray())
                .replaceAll("[\\[\\]\\ ]", "")
                .toString()
                .trim()
                .split(",");
        System.out.println(fruitCount(a_AppleTreePoint, apple, houseRange, 0));
        System.out.println(fruitCount(b_OrangeTreePoint, orange, houseRange, 0));
    }

    private static int fruitCount(int treePoint, int[] fruit, String[] houseRange, int count) {
        for (Integer a : fruit) {
            count = Arrays.asList(houseRange)
                    .contains(String.valueOf(treePoint + a)) ? count + 1 : count;
        }
        return count;
    }
}
