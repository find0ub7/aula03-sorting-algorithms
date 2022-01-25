package com.letscode.benchmark;

import com.letscode.sort.BubbleSort;
import com.letscode.sort.QuickSort;
import com.letscode.sort.SelectionSort;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class SortBenchmark {

    public static final int[] array = BenchmarkUtils.generateIntArray(100000);

    @Benchmark
    @Fork(1)
    @Warmup(iterations = 5)
    @Measurement(iterations = 5)
    @BenchmarkMode(Mode.AverageTime)
    public void benchSelectionSort() {
        new SelectionSort().execute(array);
    }

    @Benchmark
    @Fork(1)
    @Warmup(iterations = 5)
    @Measurement(iterations = 5)
    @BenchmarkMode(Mode.AverageTime)
    public void benchBubbleSort() {
        new BubbleSort().execute(array);
    }

    @Benchmark
    @Fork(1)
    @Warmup(iterations = 5)
    @Measurement(iterations = 5)
    @BenchmarkMode(Mode.AverageTime)
    public void benchQuickSort() {
        new QuickSort().execute(array);
    }
}
