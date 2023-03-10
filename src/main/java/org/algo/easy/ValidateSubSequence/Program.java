package org.algo.easy.ValidateSubSequence;

import java.util.List;

public class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int j = 0;
        int count = 0;
        for(int i =0;i<array.size();i++){
            if(j < sequence.size() && sequence.get(j) == array.get(i)) {
                j++;
                count++;
            }

        }
        if(count == sequence.size()){
            return true;
        }
        return false;

    }
}
