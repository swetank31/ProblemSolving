package com.swetank.problemsolving.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * K Closest Points to Origin - 973
 */
public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        Map<Double, ArrayList<Integer>> map = new HashMap();
        double[] distanceList = new double[points.length];
        int[][] ans = new int[K][2];
        for (int i = 0; i < points.length; i++) {
            Double d = Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2);
            ArrayList pointData = null;
            if (map.containsKey(d)) {
                pointData = map.get(d);
            } else {
                pointData = new ArrayList();
            }
            pointData.add(points[i][0]);
            pointData.add(points[i][1]);
            map.put(d, pointData);
            distanceList[i] = d;
        }
        Arrays.sort(distanceList);
        int count = 0;
        while (count != K) {
            ArrayList<Integer> pointsArray = map.get(distanceList[count]);
            for (int i = 0; i < pointsArray.size(); i = i + 2) {
                ans[count][0] = pointsArray.get(i);
                ans[count][1] = pointsArray.get(i + 1);
                count++;
                if (count == K) break;
            }
        }
        return ans;
    }

    /**
     * Alternate Solution
     */

    static class Pair {
        int x;
        int y;

        // Constructor
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] kClosestAlternate(int[][] points, int K) {
        final Map<Pair, Double> map = new HashMap();
        for (int i = 0; i < points.length; i++) {
            Pair p = new Pair(points[i][0], points[i][1]);
            double d = Math.sqrt(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
            map.put(p, d);
        }

        PriorityQueue<Pair> heap = new PriorityQueue<>(K, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return map.get(p1) < map.get(p2) ? 1 : -1;
            }
        });

        for (Pair p : map.keySet()) {
            heap.offer(p);
            if (heap.size() > K) heap.poll();
        }

        int[][] ans = new int[K][2];

        int count = 0;
        while (count != K) {
            Pair p = heap.remove();
            ans[count][0] = (int) p.x;
            ans[count][1] = (int) p.y;
            count++;
        }
        return ans;

    }
}
