package com.deepaksp.hackerrank.interview.modifyprices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Deepak
 *
 */
public class ModifyPrices {

    public static void main(String[] args) {
        String[] origItems = { "rice", "sugar", "wheat", "cheese" };
        float[] origPrices = { 16.89F, 56.92F, 20.89F, 345.99F };
        String[] items = { "rice", "cheese" };
        float[] prices = { 15.99F, 400.79F };
        List<String> originalItems = new ArrayList(Arrays.asList(origItems));
        List<Float> originalPrices = addFloatsToArray(origPrices);
        List<String> actualItems = new ArrayList(Arrays.asList(items));
        List<Float> actualPrices = addFloatsToArray(prices);
        int count = 0;
        for (String aItems : actualItems) {
            int oi = originalItems.indexOf(aItems);
            float op = originalPrices.get(oi);
            int aii = actualItems.indexOf(aItems);
            if (op != actualPrices.get(aii)) {
                count++;
            }
        }
        System.out.println(count);

    }

    private static List addFloatsToArray(float[] a) {
        List<Float> l = new ArrayList<>();
        for (float f : a) {
            l.add(f);
        }
        return l;
    }
}
