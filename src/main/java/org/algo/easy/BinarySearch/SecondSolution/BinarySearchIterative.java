package org.algo.easy.BinarySearch.SecondSolution;

import org.algo.easy.BinarySearch.BinarySearch;

public class BinarySearchIterative implements BinarySearch {

    public  int binarySearch(int[] array, int target) {
        return binarySearch(array,target,0,array.length-1);
    }

    public   int binarySearch(int[] array, int target, int lo, int hi) {

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int potentialMatch = array[mid];

            if (target == potentialMatch) {
                return mid;
            } else if (target < potentialMatch) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;

        BinarySearch bs = new BinarySearchIterative();
        int result = bs.binarySearch(array, target);
        System.out.println(result);
    }

}
