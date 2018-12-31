package com.java.state;

public class TVContext {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void performAction(){
        state.doAction();
    }
}
