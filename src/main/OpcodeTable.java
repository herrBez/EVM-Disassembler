package main;

import java.util.HashMap;
import java.util.Map;
import main.Code;


public class OpcodeTable {
    
    public final String OPCode_ERROR = "no";
    public final static Code [] opcode = new Code[] {
            Code.STOP, //0x00
            Code.ADD, // 0x01
            Code.MUL,
            Code.SUB,
            Code.DIV,
            Code.SDIV,
            Code.MOD,
            Code.SMOD,
            Code.ADDMOD,
            Code.MULMOD,
            Code.EXP,
            Code.SIGNEXTEND, //0x0b
            Code.ERRCODE, // 0x0c
            Code.ERRCODE, // 0x0d
            Code.ERRCODE, // 0x0e
            Code.ERRCODE, // 0x0f
            Code.LT,
            Code.GT,
            Code.SLT,
            Code.SGT,
            Code.EQ,
            Code.ISZERO,
            Code.AND,
            Code.OR,
            Code.XOR,
            Code.NOT,
            Code.BYTE, // 0x1a
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE, //0x1f
            Code.SHA3, //0x20
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ADDRESS, // 0x30
            Code.BALANCE,
            Code.ORIGIN,
            Code.CALLER,
            Code.CALLVALUE,
            Code.CALLDATALOAD,
            Code.CALLDATASIZE,
            Code.CALLDATACOPY,
            Code.CODESIZE,
            Code.CODECOPY,
            Code.GASPRICE,
            Code.EXTCODESIZE,
            Code.EXTCODECOPY,
            Code.RETURNDATASIZE,
            Code.RETURNDATACOPY, // 0x3e
            Code.ERRCODE,
            Code.BLOCKHASH,
            Code.COINBASE,
            Code.TIMESTAMP,
            Code.NUMBER,
            Code.DIFFICULTY,
            Code.GASLIMIT,  // 0x45
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE, // 0x4f
            Code.POP, // 0x50
            Code.MLOAD,
            Code.MSTORE,
            Code.MSTORE8,
            Code.SLOAD,
            Code.SSTORE,
            Code.JUMP,
            Code.JUMPI,
            Code.PC,
            Code.MSIZE,
            Code.GAS,
            Code.JUMPDEST,// 0x5b
            Code.ERRCODE, // 0x5c
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.PUSH1,
            Code.PUSH2,
            Code.PUSH3,
            Code.PUSH4,
            Code.PUSH5,
            Code.PUSH6,
            Code.PUSH7,
            Code.PUSH8,
            Code.PUSH9,
            Code.PUSH10,
            Code.PUSH11,
            Code.PUSH12,
            Code.PUSH13,
            Code.PUSH14,
            Code.PUSH15,
            Code.PUSH16,
            Code.PUSH17,
            Code.PUSH18,
            Code.PUSH19,
            Code.PUSH20,
            Code.PUSH21,
            Code.PUSH22,
            Code.PUSH23,
            Code.PUSH24,
            Code.PUSH25,
            Code.PUSH26,
            Code.PUSH27,
            Code.PUSH28,
            Code.PUSH29,
            Code.PUSH30,
            Code.PUSH31,
            Code.PUSH32, // 0x7f
            Code.DUP1, // 0x80
            Code.DUP2,
            Code.DUP3,
            Code.DUP4,
            Code.DUP5,
            Code.DUP6,
            Code.DUP7,
            Code.DUP8,
            Code.DUP9,
            Code.DUP10,
            Code.DUP11,
            Code.DUP12,
            Code.DUP13,
            Code.DUP14,
            Code.DUP15,
            Code.DUP16, //0x8f
            Code.SWAP1, //0x90
            Code.SWAP2,
            Code.SWAP3,
            Code.SWAP4,
            Code.SWAP5,
            Code.SWAP6,
            Code.SWAP7,
            Code.SWAP8,
            Code.SWAP9,
            Code.SWAP10,
            Code.SWAP11,
            Code.SWAP12,
            Code.SWAP13,
            Code.SWAP14,
            Code.SWAP15,
            Code.SWAP16, // 0x9f
            Code.LOG0, // 0xa0
            Code.LOG1,
            Code.LOG2,
            Code.LOG3,
            Code.LOG4, // 0xa4
            Code.ERRCODE, // 0xa5
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE, // 0xaf
            Code.ERRCODE, // 0xb0
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE, // 0xbf
            Code.ERRCODE, // 0xc0
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE, // 0xcf
            Code.ERRCODE, // 0xd0
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE, // 0xdf
            Code.ERRCODE, // 0xe0
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE, // 0xef
            Code.CREATE, // 0xf0
            Code.CALL, // 0xf1
            Code.CALLCODE, // 0xf2
            Code.RETURN, // 0xf3
            Code.DELEGATECALL, // 0xf4
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE,
            Code.ERRCODE, // 0xf9
            Code.STATICCALL, // 0xfa
            Code.ERRCODE,
            Code.ERRCODE,
            Code.REVERT, // 0xfd
            Code.INVALID, // 0xfe
            Code.SELFDESTRUCT // 0xff
    };

    public static Map<Code, Integer> opcodeRequiredBytes = new HashMap<Code, Integer>() {{
        put(Code.PUSH1, 1);
        put(Code.PUSH2, 2);
        put(Code.PUSH3, 3);
        put(Code.PUSH4, 4);
        put(Code.PUSH5, 5);
        put(Code.PUSH6, 6);
        put(Code.PUSH7, 7);
        put(Code.PUSH8, 8);
        put(Code.PUSH9, 9);
        put(Code.PUSH10, 10);
        put(Code.PUSH11, 11);
        put(Code.PUSH12, 12);
        put(Code.PUSH13, 13);
        put(Code.PUSH14, 14);
        put(Code.PUSH15, 15);
        put(Code.PUSH16, 16);
        put(Code.PUSH17, 17);
        put(Code.PUSH18, 18);
        put(Code.PUSH19, 19);
        put(Code.PUSH20, 20);
        put(Code.PUSH21, 21);
        put(Code.PUSH22, 22);
        put(Code.PUSH23, 23);
        put(Code.PUSH24, 24);
        put(Code.PUSH25, 25);
        put(Code.PUSH26, 26);
        put(Code.PUSH27, 27);
        put(Code.PUSH28, 28);
        put(Code.PUSH29, 29);
        put(Code.PUSH30, 30);
        put(Code.PUSH31, 31);
        put(Code.PUSH32, 32);
    }};

}
