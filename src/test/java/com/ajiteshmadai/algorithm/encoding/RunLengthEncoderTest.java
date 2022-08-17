package com.ajiteshmadai.algorithm.encoding;

import org.junit.Test;

public class RunLengthEncoderTest {

    @Test
    public void testEncode() {
        String plainText = "aaaabbcc";
        RunLengthEncoder encoder =  new RunLengthEncoder();
        String output = encoder.encode(plainText);
        System.out.println(output);

        plainText = "79239239232297777777777777777777777777777777777777777777";
        output = encoder.encode(plainText);
        System.out.println(output);
    }
}
