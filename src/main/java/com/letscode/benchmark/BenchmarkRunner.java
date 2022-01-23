package com.letscode.benchmark;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkRunner {

    public static void main(String[] args) throws Exception {
        Options options = new OptionsBuilder()
                .include(SortBenchmark.class.getSimpleName())
                .build();

        new Runner(options).run();

//        org.openjdk.jmh.Main.main(args);
    }
}
