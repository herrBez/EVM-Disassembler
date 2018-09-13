package main;

import main.cfg.Node;
import main.opcode.Code;
import main.opcode.OpcodeTable;

import java.util.ArrayList;

public class OpcodeOutputTarget implements Target<Node[]> {


    public Node[] output(short[] code) {
        ArrayList<Node> ln = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            Code op = OpcodeTable.opcode[code[i]];
            Node n = new Node();
            n.address = i;
            n.code = op;

            if (op == Code.ERRCODE) {
                n.argument = new short[1];
                n.argument[0] = code[i];
            }

            Integer additionalBytes = OpcodeTable.opcodeRequiredBytes.get(OpcodeTable.opcode[code[i]]);

            if (additionalBytes != null && additionalBytes > 0) {
                n.argument = new short[additionalBytes];
                for (int j = 1; j <= additionalBytes; j++) {
                    if (i + j < code.length)
                        n.argument[j-1] = code[i + j];
                    else
                        n.argument[j-1] = 0;
                }
                i = i + additionalBytes;
            }
            ln.add(n);
        }
        return ln.toArray(new Node[ln.size()]);
    }

}
