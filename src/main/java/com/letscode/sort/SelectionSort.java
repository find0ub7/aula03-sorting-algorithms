package com.letscode.sort;

public class SelectionSort implements Sort {

    @Override
    public int[] execute(int[] array) {
        //12 3 45 28 19
        //2 3 45 28 19
        //posicao 0: menor entre todos: 3 12 45 28 19
        //posicao 1: menor entre todos menos o 1º: 3 12 45 28 19
        //posicao 2: menor entre todos menos os 2 primeiros: 3 12 19 45 28
        //posicao 3: menor entre todos menos os 3 primeiros: 3 12 19 28 45
        //...
        //0 -> 1..final
        //1 -> 2..final
        //...

        for (int i = 0; i < array.length; i++) {
            int indMenorValor = i; //0, 1, 2, 3, ...
            int menorValor = array[i]; //12

            for (int j = i + 1; j < array.length; j++) {
                if (menorValor > array[j]) {
                    menorValor = array[j];
                    indMenorValor = j;
                }
            }
            array[indMenorValor] = array[i];
            array[i] = menorValor;
        }

        return array;
    }
}
