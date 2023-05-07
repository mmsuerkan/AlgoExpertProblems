package org.problems.easy.TwoNumberSum;

import java.util.HashMap;
import java.util.HashSet;

public class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            if(set.contains(targetSum-i)){
              return new int[]{targetSum-i,i};
            }else{
                set.add(i);
            }
        }

        return new int[0];
    }
}
