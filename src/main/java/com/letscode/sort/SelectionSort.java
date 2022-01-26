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
        //complexidade de tempo
        //n=1: 0
        //n=2: 1
        //n=3: 2 + 1
        //n=4: 3 + 2 + 1
        //n=5: 4 + 3 + 2 + 1
        //n=N: (N-1) + (N-2) ... + 3 + 2 + 1 -> soma de PA -> [(N-1)+1] * (N-1)/2 = N * (N-1)/2 = (N^2 - N)/2
        //.: O(n^2)

//Identificando a formula da soma de PA:
//        soma(1 + 2 + 3) = (3 + 1) * 3/2 = 6
//        soma(1 + 2 + 3 + 4) = (4 + 1) * 4/2 = 10
//        soma(1 + 2 + 3 + 4 + 5) = (5 + 1) * 5/2 = 15
//        soma(1 + 2 + 3 + 4 + 5 + 6) = (6 + 1) * 6/2 = 21
//        soma(1 + 2 + 3 + ... + N) = (N + 1) * N/2

        return array;
    }
}
