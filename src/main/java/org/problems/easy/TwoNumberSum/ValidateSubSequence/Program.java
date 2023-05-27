package org.problems.easy.TwoNumberSum.ValidateSubSequence;

import java.util.List;

class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {


        int sequenceIndex = 0;

        for(int arrayIndex = 0; sequenceIndex< array.size();arrayIndex++){

            if(array.get(arrayIndex) == sequence.get(sequenceIndex)){
                sequenceIndex++;
            }
            if(sequenceIndex == sequence.size()){
                return true;
            }

        }

        return false;
    }
}
