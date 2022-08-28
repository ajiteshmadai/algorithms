package com.ajiteshmadai.algorithm.sorting;

public class BubbleSort<T extends Comparable> implements Sort<T> {

    @Override
    public T[] sort(T[] input) {
        T temp;
        int interation = 0;
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j <  input.length - 1 ; j++) {
                interation++;
                if(input[j].compareTo(input[j+1]) > 0) {
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }

            }
        }
        System.out.format("Bubble Sort completed in  %d interations for %d length array", interation, input.length);
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
