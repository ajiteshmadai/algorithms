package com.ajiteshmadai.algorithm.sorting;

public class SelectionSort<T extends Comparable> implements Sort<T> {


    @Override
    public T[] sort(T[] input) {
        T temp;
        int interation = 0;
        for(int i = 0; i < input.length; i++) {
            for(int j = i+1; j < input.length; j++) {
                interation++;
                if(input[i].compareTo(input[j]) > 0 ) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        System.out.format("Sort completed in  %d interations for %d length array", interation, input.length);
        return input;
    }
}
