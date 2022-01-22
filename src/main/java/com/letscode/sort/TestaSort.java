package com.letscode.sort;

public class TestaSort {

    public static void main(String[] args) {
//        Sort sort = new SelectionSort();
        Sort sort = new BubbleSort();

        int[] array = {12, 3, 45, 28, 19};
        System.out.println("Antes:");
        print(array);
        int[] sortedArray = sort.execute(array);
        System.out.println("Depois (ordenado):");
        print(sortedArray);
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
