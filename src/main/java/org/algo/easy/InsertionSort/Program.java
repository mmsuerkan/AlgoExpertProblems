package org.algo.easy.InsertionSort;

public class Program {
    public static int[] insertionSort(int[] array) {

        for(int i = 0;i< array.length;i++){
            for(int j = i; j> 0 ; j--){
                if(array[j] < array[j-1]){
                    swap(array,j,j-1);
                }
            }
        }

        return array;
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
