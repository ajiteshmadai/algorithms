package com.ajiteshmadai.algorithm.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void testSort() {
        Sort<Integer> selectionSort = new SelectionSort<>();
        Integer[] input = {100, 99, 98, 97, 96, 95,93, 92};
        Integer[] output = selectionSort.sort(input);
        Arrays.stream(output).forEach(i -> System.out.format("%d ", i));
    }
}