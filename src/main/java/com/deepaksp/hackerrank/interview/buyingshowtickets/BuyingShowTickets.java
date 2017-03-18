package com.deepaksp.hackerrank.interview.buyingshowtickets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Deepak
 *
 */
public class BuyingShowTickets {

    private static Long calculateTimeTakenToGetAllTickets(int[] tickets, int p) {
        Long count = 0L;
        List<Integer> list = new ArrayList(Arrays.asList(tickets));
        for (int i = 1; i < tickets.length; i++) {
            list.add(tickets[i]);
        }
        final int size = list.size();
        boolean done = false;
        while (!done) {
            for (int j = 1; j < size; j++) {
                if (list.get(j) == 0) {
                    continue;
                }
                if (list.get(p + 1) == 0) {
                    done = true;
                    break;
                }
                list.set(j, list.get(j) - 1);
                count++;
            }
        }
        return count;
    }
}
