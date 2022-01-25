package com.letscode.benchmark;

import com.letscode.sort.QuickSort;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class BenchmarkRunner {

    public static void main(String[] args) throws Exception {
//        Options options = new OptionsBuilder()
//                .include(SortBenchmark.class.getSimpleName())
//                .build();
//
//        new Runner(options).run();

//        org.openjdk.jmh.Main.main(args);

//        benchmarkManual();

    }

    private static void benchmarkManual() {
        int[] array = BenchmarkUtils.generateIntArray(100000);
        QuickSort quickSort = new QuickSort();

        //warmup para executar o jit
        for (int i = 0; i < 100; i++) {
            quickSort.execute(array);
        }

        //benchmark
        LocalDateTime start = LocalDateTime.now();
        System.out.println(start);

        quickSort.execute(array);

        LocalDateTime end = LocalDateTime.now();
        System.out.println(end);

        System.out.println("Tempo: " + start.until(end, ChronoUnit.MICROS));
    }
}
