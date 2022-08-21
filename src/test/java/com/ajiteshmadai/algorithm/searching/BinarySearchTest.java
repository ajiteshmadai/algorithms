package com.ajiteshmadai.algorithm.searching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void testSearch() {
        Integer arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 17};
        BinarySearch<Integer> binarySearch =  new BinarySearch<>();
        int index = binarySearch.search(arr, 10);
        assertEquals(8, index);

        arr = new Integer[]{2, 3};
        index = binarySearch.search(arr, 3);
        assertEquals(1, index);



    }
}