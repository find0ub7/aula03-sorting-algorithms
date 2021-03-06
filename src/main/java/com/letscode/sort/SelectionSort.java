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
            int indMenorValor = i; //0, 1, 2, 3, ...    N
            int menorValor = array[i]; //12             N

            for (int j = i + 1; j < array.length; j++) { //j = 3 j < 4 -> 3 + 2 + 1
                if (menorValor > array[j]) {
                    menorValor = array[j];
                    indMenorValor = j;
                }
            }
            array[indMenorValor] = array[i];
            array[i] = menorValor;
        }
        //complexidade de tempo
        //length=1: 0
        //length=2: 1
        //length=3: 2 + 1
        //length=4: 3 + 2 + 1
        //length=5: 4 + 3 + 2 + 1
        //length=6: 5 + 4 + 3 + 2 + 1
        //length=7: 6 + 5 + 4 + 3 + 2 + 1
        //length=N: (N-1) + (N-2) + ... + 3 + 2 + 1 -> soma de PA -> [(N-1)+1] * (N-1)/2 = N * (N-1)/2 = (N^2 - N)/2
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
