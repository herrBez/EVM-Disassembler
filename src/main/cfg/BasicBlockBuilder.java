package main.cfg;

import main.opcode.Code;

import java.util.ArrayList;
import java.util.List;

public class BasicBlockBuilder {

    private static void createBasicBlock(List<BasicBlock> lb, List<Node> currentBasicBlock) {
        lb.add(new BasicBlock(
                        currentBasicBlock.toArray(
                                new Node[currentBasicBlock.size()]
                        )
                )
        );
        currentBasicBlock = new ArrayList<>();
    }

    public static BasicBlock[] createBasicBlock(Node[] nodes) {
        List<BasicBlock> lb = new ArrayList<>();
        List<Node> currentBasicBlock = new ArrayList<>();

        for(Node n : nodes) {
            switch(n.code) {
                case JUMP:
                case JUMPI:
                case RETURN:
                case STOP:
                case SELFDESTRUCT:
                case CREATE:
                case CALL:
                case CALLCODE:
                case DELEGATECALL:
                case REVERT:
                case ERRCODE:
                    currentBasicBlock.add(n);
                    lb.add(new BasicBlock(
                                    currentBasicBlock.toArray(
                                            new Node[currentBasicBlock.size()]
                                    )
                            )
                    );
                    currentBasicBlock = new ArrayList<>();
                    break;
                case JUMPDEST:
                    if(currentBasicBlock.size() > 0) {
                        lb.add(new BasicBlock(
                                        currentBasicBlock.toArray(
                                                new Node[currentBasicBlock.size()]
                                        )
                                )
                        );
                        currentBasicBlock = new ArrayList<>();
                    }
                    currentBasicBlock.add(n);
                    break;

                default:
                    currentBasicBlock.add(n);

            }
        }
        return lb.toArray(new BasicBlock[lb.size()]);
    }
}
