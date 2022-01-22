package com.letscode.utils.reader;

import java.util.Scanner;
import java.util.function.Function;

//Exemplo de um reader "generico" com close implicito no try-with-resources
public class ScanReaderUtils {

    public String readString() {
        return read(Scanner::nextLine);
    }

    public int readInt() {
        return read(Scanner::nextInt);
    }

    public float readFloat() {
        return read(Scanner::nextFloat);
    }

    private <T> T read(Function<Scanner, T> function) {
        T readValue;
        try(Scanner scanner = new Scanner(System.in)) {
            readValue = function.apply(scanner);
        }//ao terminar o bloco de try, ele chama o scanner.close(); devido ao try-with-resources
        return readValue;
    }
}
