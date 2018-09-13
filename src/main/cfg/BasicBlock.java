package main.cfg;

public class BasicBlock {
    private Node[] basicBlock;
    // Division taken from Towards verifying ethereum smart contract...
    enum Type {
        NEXT,
        TERMINAL,
        JUMP,
        JUMPI,
        UNKOWN
    }
    private Type type;
    private int startAddress;

    public BasicBlock(Node[] basicBlock){
        this.basicBlock = basicBlock;
        if(basicBlock.length < 1) {
            this.type = type.UNKOWN;
            return;
        }
        Node firstInstruction = basicBlock[0];
        this.startAddress = firstInstruction.address;

        Node lastInstruction = basicBlock[Math.max(0, basicBlock.length-1)];
        switch (lastInstruction.code) {
            case JUMPI:
                this.type = Type.JUMPI;
                break;
            case JUMP:
                this.type = Type.JUMP;
                break;
            case RETURN:
            case STOP:
            case SELFDESTRUCT:
            case CREATE:
            case CALL:
            case CALLCODE:
            case DELEGATECALL:
            case REVERT:
            case ERRCODE:
                this.type = Type.TERMINAL;
                break;
            default:
                this.type = Type.NEXT;
                break;
        }
    }
    public Node[] getNodeArray() {
        return basicBlock;
    }

    public Type getType() {
        return this.type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("== BB of type " + this.type + "==").append("\n");
        for(Node n : basicBlock) {
            sb.append(n.toString()).append('\n');
        }
        return sb.toString();
    }
}
