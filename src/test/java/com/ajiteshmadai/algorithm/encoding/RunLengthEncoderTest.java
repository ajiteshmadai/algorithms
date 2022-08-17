package com.ajiteshmadai.algorithm.encoding;

import org.junit.Test;

public class RunLengthEncoderTest {

    @Test
    public void testEncode() {
        String plainText = "aaaabbcc";
        RunLengthEncoder encoder =  new RunLengthEncoder();
        String output = encoder.encode(plainText);
        System.out.println(output);
    }
}
