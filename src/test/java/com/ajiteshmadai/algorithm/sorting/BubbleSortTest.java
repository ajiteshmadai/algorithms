package com.ajiteshmadai.algorithm.sorting;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void testSort() {
        Sort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] input = {100, 99, 98, 97, 96, 95,93, 92};
        Integer[] output = bubbleSort.sort(input);
        Arrays.stream(output).forEach(i -> System.out.format("%d ", i));
    }
}