package org.algo.easy.SortedSquareArray;

import java.util.Arrays;

public class Program {

    public int[] sortedSquaredArray(int[] array) {
        int first = 0;
        int last = array.length -1;

        int [] output = new int[array.length];

        for(int i = array.length-1;i>= 0;i--){
            int smaller = array[first];
            int larger = array[last];
            if(Math.abs(smaller) > Math.abs(larger)){
                output[i] = smaller * smaller;
                first++;
            }else{
                output[i] = larger * larger;
                last--;
            }
        }

        return output;
    }
}
