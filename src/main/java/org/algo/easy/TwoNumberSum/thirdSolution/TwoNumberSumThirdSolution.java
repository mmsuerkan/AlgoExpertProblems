package org.algo.easy.TwoNumberSum.thirdSolution;

import java.util.Arrays;
import java.util.logging.Logger;

public class TwoNumberSumThirdSolution implements org.algo.easy.TwoNumberSum.TwoNumberSum {

    public int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            int current = array[left] + array[right];
            if(current == targetSum){
                return new int[]{array[left], array[right]};
            }else if(current < targetSum){
                left++;
            }
            else{
                right--;
            }

        }
        return new int[0];
    }

    public static void main(String[] args) {

        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        TwoNumberSumThirdSolution instance = new TwoNumberSumThirdSolution();

        int[] result = instance.twoNumberSum(array, targetSum);
        for (int i = 0; i < result.length; i++) {
            Logger.getLogger("TwoNumberSumSecondSolution").info(result[i] + " ");
        }

    }
}
