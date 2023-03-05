package org.algo.easy.TwoNumberSum.secondSolution;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class TwoNumberSumSecondSolution implements org.algo.easy.TwoNumberSum.TwoNumberSum{

    public int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.

        Set<Integer> set = new HashSet<>();

        for (int i = 0;i<array.length;i++){
            int number = array[i];
            int diff = targetSum - number;
            if(set.contains(diff)){
                return new int[]{number,diff};
            }else{
                set.add(number);
            }
        }


        return new int[0];
    }

    public static void main(String[] args) {

        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        TwoNumberSumSecondSolution instance = new TwoNumberSumSecondSolution();
        int[] result = instance.twoNumberSum(array, targetSum);
        for (int i = 0; i < result.length; i++) {
            Logger.getLogger("TwoNumberSumSecondSolution").info(result[i] + " ");
        }

    }
}
