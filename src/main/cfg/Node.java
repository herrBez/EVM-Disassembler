package main.cfg;

import main.opcode.Code;

public class Node {
    public Code code;
    public short[] argument;
    public int address;

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("0x%04x", address)).append("|");
        if(code != Code.ERRCODE) {
            sb.append(code);
            if (argument != null && argument.length > 0) {
                sb.append("(");
                for (short arg : argument) {
                    sb.append(String.format("%02x", arg));
                }
                sb.append(")");
            }
        } else {
            sb.append(String.format("0x%02x", argument[0]));
        }
        return sb.toString();
    }
}
