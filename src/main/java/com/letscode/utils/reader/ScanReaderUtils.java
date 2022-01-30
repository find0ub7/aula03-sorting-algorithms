package com.letscode.utils.reader;

import java.util.Scanner;
import java.util.function.Function;

//Exemplo de um reader "generico" com close implicito no try-with-resources
public class ScanReaderUtils {

    private Scanner scanner = new Scanner(System.in);

    public String readString() {
        return read(Scanner::nextLine);
    }

    public int readInt() {
        return read(Scanner::nextInt);
    }

    public float readFloat() {
        return read(Scanner::nextFloat);
    }

    public int[] readPairInt() {
        return new int[]{readInt(), readInt()};
    }

    private <T> T read(Function<Scanner, T> function) {
        T readValue;
        return function.apply(scanner);
    }
}
