package com.letscode.benchmark;

import com.letscode.sort.QuickSort;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkRunner {

  public static void main(String[] args) throws Exception {
//    opcaoExecucaoUsandoBenchmarkMain(args);
        opcaoExecucaoUsandoRunnerComOpcoes();
//        benchmarkManual();

  }

  private static void opcaoExecucaoUsandoBenchmarkMain(String[] args) throws IOException {
    org.openjdk.jmh.Main.main(args);
  }

  private static void opcaoExecucaoUsandoRunnerComOpcoes() throws RunnerException {
    Options options = new OptionsBuilder()
        .include(ListBenchmark.class.getSimpleName())
        .build();

    new Runner(options).run();
  }

  private static void benchmarkManual() {
    int[] array = BenchmarkUtils.generateIntArray(100000);
    QuickSort quickSort = new QuickSort();

    //warmup para executar o jit
//    for (int i = 0; i < 100; i++) {
//      quickSort.execute(array);
//    }

    //benchmark
    LocalDateTime start = LocalDateTime.now();
    System.out.println(start);

    quickSort.execute(array);

    LocalDateTime end = LocalDateTime.now();
    System.out.println(end);

    System.out.println("Tempo: " + start.until(end, ChronoUnit.MICROS));
    //1106 micro segundos com aquecimento
    //152268 micro segundos sem aquecimento
  }
}
