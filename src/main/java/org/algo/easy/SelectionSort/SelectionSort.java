package org.algo.easy.SelectionSort;

public class SelectionSort {

    public static void main(String[] args) {

            int[] arr = {8, 5, 2, 9, 5, 6, 3};
            int[] sortedArr = selectionSort(arr);
            for (int i = 0; i < sortedArr.length; i++) {
                System.out.print(sortedArr[i] + " ");
            }
    }

    private static int[] selectionSort(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
        return arr;
    }

    private static void swap(int[] arr, int minIndex, int i) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
