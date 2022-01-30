package com.letscode.benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class ListBenchmark {

    public static final int AMOUNT = 1000000;

    @Benchmark
    @Fork(1)
    @Warmup(iterations = 1)
    @Measurement(iterations = 3)
    @BenchmarkMode(Mode.AverageTime)
    public void ArrayListAddBench() {
        List<Integer> arrayList = new ArrayList<>(AMOUNT);
        for (int i = 0; i < AMOUNT; i++) {
            arrayList.add(i);
        }
    }

    @Benchmark
    @Fork(1)
    @Warmup(iterations = 1)
    @Measurement(iterations = 3)
    @BenchmarkMode(Mode.AverageTime)
    public void LinkedListAddBench() {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < AMOUNT; i++) {
            linkedList.add(i);
        }
    }
}
