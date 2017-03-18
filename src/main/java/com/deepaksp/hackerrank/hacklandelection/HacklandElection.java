package com.deepaksp.hackerrank.hacklandelection;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Deepak
 *
 */
public class HacklandElection {

    public static void main(String[] args) {
        String[] votes = { "victor", "veronica", "ryan", "dave", "maria", "farah", "farah", "ryan", "veronica" };
        Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (String vote : votes) {
            if (map.containsKey(vote)) {
                map.put(vote, map.get(vote) + 1);
            } else {
                map.put(vote, 1);
            }
        }
        System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue())
                .getKey());
    }
}
