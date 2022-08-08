package com.sparta.ji;


public class MergingArrays {

    public static int[] mergeArray(int[] arr1, int[] arr2) {

        int[] newArray = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && i < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newArray[k++] = arr1[i++];
            } else {
                newArray[k = k + 1] = arr2[j = j + 1];
            }
        }
        while (i < arr1.length) {
            newArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            newArray[k++] = arr2[j++];
        }
        return newArray;
    }
}
