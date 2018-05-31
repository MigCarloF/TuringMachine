package com.company;

public class State {

    private int stateNum;

    private State retOnA, retOn1, retOnHash, retOnSpace, retOnStart, retOnT, retOnX;

    public State(int stateNum, State retOnA, State retOn1, State retOnHash, State retOnSpace, State retOnStart, State retOnT, State retOnX) {
        this.stateNum = stateNum;
        this.retOnA = retOnA;
        this.retOn1 = retOn1;
        this.retOnHash = retOnHash;
        this.retOnSpace = retOnSpace;
        this.retOnStart = retOnStart;
        this.retOnT = retOnT;
        this.retOnX = retOnX;
    }

    public State transition(char feed) {
        switch (feed) {
            case 'A':
                return retOnA;
            case '#':
                return retOnHash;
            case '1':
                return retOn1;
            case '_':
                return retOnSpace;
            case '>':
                return retOnStart;
            case 'T':
                return retOnT;
            case 'x':
                return retOnX;
            default:
                return null;
        }
    }
}
