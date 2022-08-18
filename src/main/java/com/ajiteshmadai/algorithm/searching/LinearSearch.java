package com.ajiteshmadai.algorithm.searching;

import java.util.List;

public class LinearSearch<T> implements Search<T>{
    @Override
    public int search(T[] words, T searchWord)  {
        int index = -1;
        if(searchWord == null){
            return index;
        }
        for(int i = 0; i < words.length; i++) {
            if(searchWord.equals(words[i])) {
                index = i;
                break;
            }
        }
        return index;
    }
}
