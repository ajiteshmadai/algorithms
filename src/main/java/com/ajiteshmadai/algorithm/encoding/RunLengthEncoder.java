package com.ajiteshmadai.algorithm.encoding;

public class RunLengthEncoder implements Encoder {

    @Override
    public String encode(String plainText) {
        if(plainText == null || plainText.isEmpty()) {
            return "";
        }

        char[] charArray = plainText.toCharArray();
        StringBuilder encodedString = new StringBuilder();
        int charCounter = 0;
        char prevChar = 0;
        for(char currentChar : charArray) {
            if(currentChar == prevChar) {
                charCounter++;
            } else {
                if (prevChar != 0) {
                    encodedString.append(charCounter).append(prevChar);
                }
                prevChar = currentChar;
                charCounter = 1;
            }
        }
        encodedString.append(charCounter).append(prevChar);
        return encodedString.toString();
    }
}
