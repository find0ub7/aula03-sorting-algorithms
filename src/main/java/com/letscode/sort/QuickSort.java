package com.letscode.sort;

import java.util.Arrays;

public class QuickSort implements Sort {
    @Override
    public int[] execute(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
