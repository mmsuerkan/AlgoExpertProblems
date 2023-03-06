package org.algo.easy.BinarySearch.FirstSolution;

import org.algo.easy.BinarySearch.BinarySearch;

public class BinarySearchRecursive implements BinarySearch {

    public  int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    public int binarySearch(int[] array, int target, int lo, int hi) {

        if (lo > hi) return -1;

        int mid = (lo + hi) / 2;
        int potentialMatch = array[mid];

        if (target == potentialMatch) {
            return mid;
        } else if (target < potentialMatch) {
            return binarySearch(array, target, lo, mid - 1);
        } else {
            return binarySearch(array, target, mid + 1, hi);
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;

        BinarySearch bs = new BinarySearchRecursive();
        int result = bs.binarySearch(array, target);
        System.out.println(result);
    }

}
