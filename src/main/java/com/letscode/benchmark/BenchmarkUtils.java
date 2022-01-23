package com.letscode.benchmark;

import java.util.Random;

public class BenchmarkUtils {

    public static int[] generateIntArray(int numbers) {
        int[] array = new int[numbers];
        Random random = new Random();
        for (int i = 0; i < numbers; i++) {
            array[i] = random.nextInt(numbers);
        }
        return array;
    }
}
