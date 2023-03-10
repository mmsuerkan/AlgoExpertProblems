package org.algo.easy.GetNthFib;

import java.util.HashMap;

public class MemoizedFib {

    public static int getNthFib(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 0);
        memo.put(2, 1);
        return getNthFib(n, memo);
    }

    private static int getNthFib(int n, HashMap<Integer, Integer> memo) {
        if (!memo.containsKey(n)) {
            memo.put(n, getNthFib(n - 1, memo) + getNthFib(n - 2, memo));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(getNthFib(6));
    }
}
