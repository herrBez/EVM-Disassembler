package main;

public class StringOutputTarget implements Target {
    @Override
    public String output(short[] code) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < code.length; i++) {
            Code op = OpcodeTable.opcode[code[i]];
            StringBuilder sb = new StringBuilder();
            if (op != Code.ERRCODE)
                sb.append(op.toString());
            else
                sb.append(String.format("0x%02X", code[i]));

            Integer additionalBytes = OpcodeTable.opcodeRequiredBytes.get(OpcodeTable.opcode[code[i]]);
            if (additionalBytes != null && additionalBytes > 0) {
                sb.append(" 0x");
                for (int j = 1; j <= additionalBytes; j++) {
                    if (i + j < code.length)
                        sb.append(String.format("%02X", code[i + j]));
                    else
                        sb.append(String.format("%02X", 0));
                }


                i = i + additionalBytes;
            }
            output.append(sb.toString()).append("\n");
        }
        return output.toString();
    }
}