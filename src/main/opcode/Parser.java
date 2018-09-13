package main.opcode;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class takes as input an hexadecimal string "0x123..." and returns
 * the corresponding byte stream. We use short instead of bytes, because
 * in Java, the bytes are signed.
 */
public class Parser {
    private static Map<Character, Short> mc = new HashMap<Character, Short>()
    {{
        put('0', (short) 0x0);
        put('1', (short) 0x1);
        put('2', (short) 0x2);
        put('3', (short) 0x3);
        put('4', (short) 0x4);
        put('5', (short) 0x5);
        put('6', (short) 0x6);
        put('7', (short) 0x7);
        put('8', (short) 0x8);
        put('9', (short) 0x9);
        put('a', (short) 0xa);
        put('b', (short) 0xb);
        put('c', (short) 0xc);
        put('d', (short) 0xd);
        put('e', (short) 0xe);
        put('f', (short) 0xf);
    }};
    
    public static short[] toShortArray(String s) throws Exception {
        // get rid of the leading 0x if any
        if (s.substring(0, 2).equals("0x")) {
            s = s.substring(2, s.length());
        }
        char [] characters = s.toCharArray();
        if(characters.length % 2 != 0)
            throw new Exception("The input should have an even length");
        short [] result = new short[characters.length/2];

        for(short i = 0; i < characters.length; i += 2) {
            result[i/2] = (short)(mc.get(characters[i]) * 16 + mc.get(characters[i+1]));
        }
        return result;
    }


}
