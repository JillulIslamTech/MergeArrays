package com.sparta.ji;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergingArrayTest {

    @Test
    @DisplayName("Merging two given arrays")
    public void printMergedArrays() {
        MergingArrays mergingArrays = new MergingArrays();
        int[] num1 = {2, 6, 7, 9, 12};
        int[] num2 = {14,16, 18, 19, 21, 56};

        int result[] = mergingArrays.mergeArray(num1, num2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}