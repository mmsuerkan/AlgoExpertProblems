package org.algo.easy.TwoNumberSum.firstSolution;

import java.util.logging.Logger;

public class TwoNumberSumFirstSolution implements org.algo.easy.TwoNumberSum.TwoNumberSum {

    public int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.

        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            int diff = targetSum - first;
            for (int j = i+1; j < array.length; j++) {
                if(diff == array[j]){
                    return new int[]{first,diff};
                }
            }
        }


        return new int[0];
    }

    public static void main(String[] args) {

        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        TwoNumberSumFirstSolution instance = new TwoNumberSumFirstSolution();

        int[] result = instance.twoNumberSum(array, targetSum);
        for (int i = 0; i < result.length; i++) {
            Logger.getLogger("TwoNumberSumSecondSolution").info(result[i] + " ");
        }

    }
}
