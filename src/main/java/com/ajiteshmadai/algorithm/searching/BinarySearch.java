package com.ajiteshmadai.algorithm.searching;

public class BinarySearch<T extends Comparable> implements Search<T>{
    @Override
    public int search(T[] words, T searchWord) {
        if(words == null || words.length == 0 || searchWord == null) {
            return 0;
        }
        return  binarysearch(words, searchWord, 0, words.length-1);
    }

    private int binarysearch(T[] words, T searchWord, int startIndex, int endIndex) {

       int mid = (startIndex + endIndex) / 2;
        System.out.format("startIndex: %d,endIndex: %d, midIndex: %d, midValue: %d\n", startIndex, endIndex, mid, words[mid]);
        if(startIndex > endIndex) {
            return -1;
        } else if(searchWord.equals(words[mid])) {
            return mid;
        } else if (searchWord.compareTo(words[mid]) > 0) {
            return binarysearch(words, searchWord, mid + 1, endIndex);
        } else if (searchWord.compareTo(words[mid]) < 0 ){
            return binarysearch(words, searchWord, startIndex, mid - 1);
        }
        return -1;

    }
}
