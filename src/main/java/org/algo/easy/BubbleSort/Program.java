package org.algo.easy.BubbleSort;

public class Program {
    public static int[] bubbleSort(int[] array) {

        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array.length-1-i;j++){
                if(array[j] > array[j + 1]){
                    swap(array,j,j+1);
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
