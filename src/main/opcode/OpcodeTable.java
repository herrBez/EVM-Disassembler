package main.opcode;

import java.util.HashMap;
import java.util.Map;

import main.opcode.Code;


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

    public static boolean isPush(Code c) {
        return c.toString().substring(0, 4).equalsIgnoreCase("PUSH");
    }

    public static Map<Code, Integer> alpha = new HashMap<Code, Integer>() {{
        put(Code.ERRCODE, 0);
        put(Code.STOP, 0);
        put(Code.ADD, 1);
        put(Code.MUL, 1);
        put(Code.SUB, 1);
        put(Code.DIV, 1);
        put(Code.SDIV, 1);
        put(Code.MOD, 1);
        put(Code.SMOD, 1);
        put(Code.ADDMOD, 1);
        put(Code.MULMOD, 1);
        put(Code.EXP, 1);
        put(Code.SIGNEXTEND, 1);
        put(Code.LT, 1);
        put(Code.GT, 1);
        put(Code.SLT, 1);
        put(Code.SGT, 1);
        put(Code.EQ, 1);
        put(Code.ISZERO, 1);
        put(Code.AND, 1);
        put(Code.OR, 1);
        put(Code.XOR, 1);
        put(Code.NOT, 1);
        put(Code.BYTE, 1);
        put(Code.SHA3, 1);
        put(Code.ADDRESS, 1);
        put(Code.BALANCE, 1);
        put(Code.ORIGIN, 1);
        put(Code.CALLER, 1);
        put(Code.CALLVALUE, 1);
        put(Code.CALLDATALOAD, 1);
        put(Code.CALLDATASIZE, 1);
        put(Code.CALLDATACOPY, 0);
        put(Code.CODESIZE, 1);
        put(Code.CODECOPY, 0);
        put(Code.GASPRICE, 1);
        put(Code.EXTCODESIZE, 1);
        put(Code.EXTCODECOPY, 0);
        put(Code.RETURNDATASIZE, 1);
        put(Code.RETURNDATACOPY, 0);
        put(Code.BLOCKHASH, 1);
        put(Code.COINBASE, 1);
        put(Code.TIMESTAMP, 1);
        put(Code.NUMBER, 1);
        put(Code.DIFFICULTY, 1);
        put(Code.GASLIMIT, 1);
        put(Code.POP, 0);
        put(Code.MLOAD, 1);
        put(Code.MSTORE, 0);
        put(Code.MSTORE8, 0);
        put(Code.SLOAD, 1);
        put(Code.SSTORE, 0);
        put(Code.JUMP, 0);
        put(Code.JUMPI, 0);
        put(Code.PC, 1);
        put(Code.MSIZE, 1);
        put(Code.GAS, 1);
        put(Code.JUMPDEST, 0);// 0x5b
        put(Code.PUSH1, 1);
        put(Code.PUSH2, 1);
        put(Code.PUSH3, 1);
        put(Code.PUSH4, 1);
        put(Code.PUSH5, 1);
        put(Code.PUSH6, 1);
        put(Code.PUSH7, 1);
        put(Code.PUSH8, 1);
        put(Code.PUSH9, 1);
        put(Code.PUSH10, 1);
        put(Code.PUSH11, 1);
        put(Code.PUSH12, 1);
        put(Code.PUSH13, 1);
        put(Code.PUSH14, 1);
        put(Code.PUSH15, 1);
        put(Code.PUSH16, 1);
        put(Code.PUSH17, 1);
        put(Code.PUSH18, 1);
        put(Code.PUSH19, 1);
        put(Code.PUSH20, 1);
        put(Code.PUSH21, 1);
        put(Code.PUSH22, 1);
        put(Code.PUSH23, 1);
        put(Code.PUSH24, 1);
        put(Code.PUSH25, 1);
        put(Code.PUSH26, 1);
        put(Code.PUSH27, 1);
        put(Code.PUSH28, 1);
        put(Code.PUSH29, 1);
        put(Code.PUSH30, 1);
        put(Code.PUSH31, 1);
        put(Code.PUSH32, 1); // 0x7f
        put(Code.DUP1, 2);
        put(Code.DUP2, 3);
        put(Code.DUP3, 4);
        put(Code.DUP4, 5);
        put(Code.DUP5, 6);
        put(Code.DUP6, 7);
        put(Code.DUP7, 8);
        put(Code.DUP8, 9);
        put(Code.DUP9, 10);
        put(Code.DUP10, 11);
        put(Code.DUP11, 12);
        put(Code.DUP12, 13);
        put(Code.DUP13, 14);
        put(Code.DUP14, 15);
        put(Code.DUP15, 16);
        put(Code.DUP16, 17);
        put(Code.SWAP1, 2);
        put(Code.SWAP2, 3);
        put(Code.SWAP3, 4);
        put(Code.SWAP4, 5);
        put(Code.SWAP5, 6);
        put(Code.SWAP6, 7);
        put(Code.SWAP7, 8);
        put(Code.SWAP8, 9);
        put(Code.SWAP9, 10);
        put(Code.SWAP10, 11);
        put(Code.SWAP11, 12);
        put(Code.SWAP12, 13);
        put(Code.SWAP13, 14);
        put(Code.SWAP14, 15);
        put(Code.SWAP15, 16);
        put(Code.SWAP16, 17);
        put(Code.LOG0, 0); // 0xa0
        put(Code.LOG1, 0);
        put(Code.LOG2, 0);
        put(Code.LOG3, 0);
        put(Code.LOG4, 0); // 0xa4
        put(Code.CREATE, 1); // 0xf0
        put(Code.CALL, 1); // 0xf1
        put(Code.CALLCODE, 1); // 0xf2
        put(Code.RETURN, 0); // 0xf3
        put(Code.DELEGATECALL, 1); // 0xf4
        put(Code.STATICCALL, 1); // 0xfa
        put(Code.REVERT, 0); // 0xfd
        put(Code.INVALID, 0); // 0xfe
        put(Code.SELFDESTRUCT, 0); // 0xff
    }};


    public static Map<Code, Integer> delta = new HashMap<Code, Integer>() {{
        put(Code.ERRCODE, 0);
        put(Code.STOP, 2);
        put(Code.ADD, 2);
        put(Code.MUL, 2);
        put(Code.SUB, 2);
        put(Code.DIV, 2);
        put(Code.SDIV, 2);
        put(Code.MOD, 2);
        put(Code.SMOD, 2);
        put(Code.ADDMOD, 3);
        put(Code.MULMOD, 3);
        put(Code.EXP, 2);
        put(Code.SIGNEXTEND, 2);
        put(Code.LT, 2);
        put(Code.GT, 2);
        put(Code.SLT, 2);
        put(Code.SGT, 2);
        put(Code.EQ, 2);
        put(Code.ISZERO, 1);
        put(Code.AND, 2);
        put(Code.OR, 2);
        put(Code.XOR, 2);
        put(Code.NOT, 1);
        put(Code.BYTE, 2);
        put(Code.SHA3, 2);
        put(Code.ADDRESS, 0);
        put(Code.BALANCE, 1);
        put(Code.ORIGIN, 0);
        put(Code.CALLER, 0);
        put(Code.CALLVALUE, 0);
        put(Code.CALLDATALOAD, 1);
        put(Code.CALLDATASIZE, 0);
        put(Code.CALLDATACOPY, 3);
        put(Code.CODESIZE, 0);
        put(Code.CODECOPY, 3);
        put(Code.GASPRICE, 0);
        put(Code.EXTCODESIZE, 1);
        put(Code.EXTCODECOPY, 4);
        put(Code.RETURNDATASIZE, 0);
        put(Code.RETURNDATACOPY, 3);
        put(Code.BLOCKHASH, 1);
        put(Code.COINBASE, 0);
        put(Code.TIMESTAMP, 0);
        put(Code.NUMBER, 0);
        put(Code.DIFFICULTY, 0);
        put(Code.GASLIMIT, 0);
        put(Code.POP, 1);
        put(Code.MLOAD, 2);
        put(Code.MSTORE, 2);
        put(Code.MSTORE8, 2);
        put(Code.SLOAD, 1);
        put(Code.SSTORE, 2);
        put(Code.JUMP, 1);
        put(Code.JUMPI, 2);
        put(Code.PC, 0);
        put(Code.MSIZE, 0);
        put(Code.GAS, 0);
        put(Code.JUMPDEST, 0);// 0x5b
        put(Code.PUSH1, 0);
        put(Code.PUSH2, 0);
        put(Code.PUSH3, 0);
        put(Code.PUSH4, 0);
        put(Code.PUSH5, 0);
        put(Code.PUSH6, 0);
        put(Code.PUSH7, 0);
        put(Code.PUSH8, 0);
        put(Code.PUSH9, 0);
        put(Code.PUSH10, 0);
        put(Code.PUSH11, 0);
        put(Code.PUSH12, 0);
        put(Code.PUSH13, 0);
        put(Code.PUSH14, 0);
        put(Code.PUSH15, 0);
        put(Code.PUSH16, 0);
        put(Code.PUSH17, 0);
        put(Code.PUSH18, 0);
        put(Code.PUSH19, 0);
        put(Code.PUSH20, 0);
        put(Code.PUSH21, 0);
        put(Code.PUSH22, 0);
        put(Code.PUSH23, 0);
        put(Code.PUSH24, 0);
        put(Code.PUSH25, 0);
        put(Code.PUSH26, 0);
        put(Code.PUSH27, 0);
        put(Code.PUSH28, 0);
        put(Code.PUSH29, 0);
        put(Code.PUSH30, 0);
        put(Code.PUSH31, 0);
        put(Code.PUSH32, 0); // 0x7f
        put(Code.DUP1, 1);
        put(Code.DUP2, 2);
        put(Code.DUP3, 3);
        put(Code.DUP4, 4);
        put(Code.DUP5, 5);
        put(Code.DUP6, 6);
        put(Code.DUP7, 7);
        put(Code.DUP8, 8);
        put(Code.DUP9, 9);
        put(Code.DUP10, 10);
        put(Code.DUP11, 11);
        put(Code.DUP12, 12);
        put(Code.DUP13, 13);
        put(Code.DUP14, 14);
        put(Code.DUP15, 15);
        put(Code.DUP16, 16);
        put(Code.SWAP1, 2);
        put(Code.SWAP2, 3);
        put(Code.SWAP3, 4);
        put(Code.SWAP4, 5);
        put(Code.SWAP5, 6);
        put(Code.SWAP6, 7);
        put(Code.SWAP7, 8);
        put(Code.SWAP8, 9);
        put(Code.SWAP9, 10);
        put(Code.SWAP10, 11);
        put(Code.SWAP11, 12);
        put(Code.SWAP12, 13);
        put(Code.SWAP13, 14);
        put(Code.SWAP14, 15);
        put(Code.SWAP15, 16);
        put(Code.SWAP16, 17);
        put(Code.LOG0, 2); // 0xa0
        put(Code.LOG1, 3);
        put(Code.LOG2, 4);
        put(Code.LOG3, 5);
        put(Code.LOG4, 6); // 0xa4
        put(Code.CREATE, 3); // 0xf0
        put(Code.CALL, 7); // 0xf1
        put(Code.CALLCODE, 7); // 0xf2
        put(Code.RETURN, 2); // 0xf3
        put(Code.DELEGATECALL, 6); // 0xf4
        put(Code.STATICCALL, 6); // 0xfa
        put(Code.REVERT, 2); // 0xfd
        put(Code.INVALID, 0); // 0xfe
        put(Code.SELFDESTRUCT, 1); // 0xff
    }};
}
