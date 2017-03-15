package com.deepaksp.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Given a time in -hour AM/PM format, convert it to military (-hour) time.
 * 
 * <b>Note</b>: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is
 * 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 * 
 * <b>Input Format</b>
 * 
 * A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where
 * and 01 <= hh <= 12 and 00 <= mm,ss <= 59.
 * 
 * <b>Output Format</b>
 * 
 * Convert and print the given time in 24-hour format, where 00 <= hh <= 23.
 * 
 * @author Deepak
 *
 */
public class Q09TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String tim = time.substring(0, 8);
        String dd = time.substring(8, 10);

        if (dd.equals("AM")) {
            if (tim.substring(0, 2)
                    .equals("12")) {
                System.out.println(tim.replace(tim.substring(0, 2), "00"));
            } else {
                System.out.println(tim);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            Integer hour = Integer.valueOf(tim.substring(0, 2)) + 12;
            hour = hour == 24 ? 12 : hour;
            sb.append(hour);
            sb.append(tim.substring(2, tim.length()));
            System.out.println(sb.toString());
        }
    }
}
