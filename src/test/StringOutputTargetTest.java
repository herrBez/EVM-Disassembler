package test;

import main.opcode.Parser;
import main.StringOutputTarget;
import main.Target;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class StringOutputTargetTest {

    @Test
    void Oracle() throws Exception {
        /* Read the expected output */
        Scanner s = new Scanner(new File("./src/test/Test1_expectedOutput.txt"));
        StringBuilder sb = new StringBuilder();
        while(s.hasNextLine()) {
            sb.append(s.nextLine() + "\n");
        }
        String expectedOutput = sb.toString();
        /* Read the input */
        String input = new Scanner(
                new File("./src/test/Test1_Input.txt"))
                .nextLine();
        /* Generate the code */
        short [] code = Parser.toShortArray(input);
        Target t = new StringOutputTarget();
        assertEquals(expectedOutput, t.output(code));

    }

}