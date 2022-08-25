package com.ajiteshmadai.algorithm.sorting;

public class BubbleSort<T extends Comparable> implements Sort<T> {

    @Override
    public T[] sort(T[] input) {
        T temp;
        for(int i = 0; i < input.length - 1; i++) {
            i = 0;
            for(int j = i+1; j < input.length - 1 ; j++) {
                if(input[i].compareTo(input[j]) > 0) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
                i++;

            }

        }
        return input;
    }

//    10, 9, 8, 7
//    0, 1 -> 9, 10, 8, 7
//    1, 2 -> 9, 8, 10, 7
//    2, 3 -> 9, 8, 7, 10
//            0, 1 -> 8, 9, 7, 10
//            1, 2 -> 8, 7, 9, 10
//            2, 3 -> 7, 8, 9, 10
//


}
